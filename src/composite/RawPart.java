package composite;
import java.util.Iterator;

import tool.tool;



public class RawPart implements PartComponent {
	
	String partId;
	String name;
	Double cost;
	
	public RawPart(String partId, String name, Double cost){
		super();
		this.partId = partId;
		this.name = name;
		this.cost = cost;
	}
	
	@Override
	public void Print() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString(){
		String spaces = "";
		for (int i = 0; i < tool.stackSize; i++)
			spaces += "   ";
		return spaces + "   RAW PART: Part Id: " + partId + ", name: " + name + ", cost: " + cost + " TL";
	}

	@Override
	public void Add(PartComponent partComponent) {
		throw new UnsupportedOperationException ();
	}

	@Override
	public void Remove(PartComponent partComponent) {
		throw new UnsupportedOperationException ();
	}

	@Override
	public Iterator<PartComponent> CreateIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
	
}
