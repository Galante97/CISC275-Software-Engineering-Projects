import java.util.ArrayList;
import java.util.Iterator;

public class Triple {
	Integer arr[] = { 1, 2, 3 };

	public static void main(String[] args) {
		
		Triple t = new Triple();.
		Iterator ti = t.iterator();
		for (int i = 0; i < 10; i++)
			if (ti.hasNext())
				System.out.print(ti.next() + " ");
		System.out.println();

	}

	public Iterator<Integer> iterator() {
		return new MyIter(arr);
	}

}
