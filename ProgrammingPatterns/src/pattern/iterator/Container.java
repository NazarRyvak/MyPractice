package pattern.iterator;

public interface Container {

	public MyIterator getIterator();
	
	public void add(int index, Object o);
	
}
