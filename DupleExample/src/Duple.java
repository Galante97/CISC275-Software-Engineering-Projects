import java.util.Iterator;

public class Duple implements Iterable {

	static Integer[] data = { 1, 7 };

	@Override
	public Iterator iterator() {

		return new myIter();

	}

	private class myIter implements Iterator {

		private int curr;

		myIter() {
			curr = 0;
		}

		@Override
		public boolean hasNext() {
			return true;
		}

		@Override
		public Object next() {
			Object o = data[curr];
			curr = (curr + 1) % data.length;
			return o;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	public static void main(String[] args) {
		Duple dup = new Duple();
		Iterator iter = dup.iterator();

		for (int i = 0; i < 20; i++) {
			if (iter.hasNext()) {
				Object element = iter.next();
				System.out.print(element + " ");
			}

			System.out.println();
		}

	}

}