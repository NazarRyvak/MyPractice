package pattern.iterator;

public class ArrayContainer implements Container {

	private Object[] arr;
	
	public ArrayContainer(int size) {
		arr = new Object[size];
	}
	
	@Override
	public MyIterator getIterator() {
		return new ArrayIterator();
	}

	@Override
	public void add(int index, Object o) throws IndexOutOfBoundsException{
		arr[index] = o; 
	}
	
	class ArrayIterator implements MyIterator {
		int index = 0;
		
		@Override
		public boolean hasNext() {
			return (index<arr.length)?true:false;
		}

		@Override
		public Object next() throws IndexOutOfBoundsException{
			return arr[index++];
		}
		
	}

}
