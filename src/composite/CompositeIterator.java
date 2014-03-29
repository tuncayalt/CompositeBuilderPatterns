package composite;
import java.util.Iterator;
import java.util.Stack;

import tool.tool;


public class CompositeIterator implements Iterator<PartComponent> {
  
	private Stack<Iterator<PartComponent>> stack = new Stack<Iterator<PartComponent>>();
  
	public CompositeIterator (Iterator<PartComponent> iterator) {
		stack.push(iterator);
		tool.stackSize = stack.size();
	}
  
	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<PartComponent> iterator = stack.peek();
      
			if (!iterator.hasNext()) {
				stack.pop();
				tool.stackSize = stack.size();
      			return hasNext();
			}else {
				return true;
			}
		}
	}

	@Override
	public PartComponent next() {
		if (hasNext()) {
			Iterator<PartComponent> iterator = stack.peek();
  			PartComponent component = iterator.next();
  			if (component instanceof GeneralPart) {
  				stack.push(component.CreateIterator());
  				tool.stackSize = stack.size();
  			}
  			return component;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
}