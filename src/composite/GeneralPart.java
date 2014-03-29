package composite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tool.tool;


public class GeneralPart implements PartComponent{

	List<PartComponent> components = new ArrayList<PartComponent>();
	String name;
	String partId;
	private Iterator<PartComponent> iterator;
	
	public GeneralPart(String partId, String name){
		super();
		this.partId = partId;
		this.name = name;
	}
	
	public void Add(PartComponent part){
		components.add(part);
	}
	
	public void Remove (PartComponent part){
		components.remove(part);
	}
	
	@Override
	public void Print() {
		System.out.println(this.toString());
		CompositeIterator iterator = new CompositeIterator(this.CreateIterator());
		
		
		while (iterator.hasNext()) {
            System.out.println(iterator.next().toString ());
		}
		System.out.println("-------------------------");
	}
	
	@Override
	public String toString(){
		String spaces = "";
		for (int i = 0; i < tool.stackSize; i++)
			spaces += "   ";
		return spaces + "GENERAL PART: Part Id: " + partId + ", name: " + name;
	}
	
	@Override
	  public Iterator<PartComponent> CreateIterator() {
	    if (iterator == null) {
	      //iterator = new CompositeIterator(components.iterator());
	    	iterator = components.iterator();
	    }
	    return iterator;
	  }

}
