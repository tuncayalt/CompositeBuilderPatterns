package composite;
import java.util.Iterator;

public interface PartComponent {
	void Print();
	void Add(PartComponent partComponent);
	void Remove(PartComponent partComponent);
	Iterator<PartComponent> CreateIterator();
}
