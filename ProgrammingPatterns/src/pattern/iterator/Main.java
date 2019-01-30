package pattern.iterator;

public class Main {

	public static void main(String[] args) {

		Container container = new ArrayContainer(3);
		container.add(0, "abc");
		container.add(1, true);
		container.add(2, 23);

		MyIterator iterator = container.getIterator();
	
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
