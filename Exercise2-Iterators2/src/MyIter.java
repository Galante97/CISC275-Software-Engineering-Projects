import java.util.Iterator;

public class MyIter implements Iterator<Integer> {

	private Integer currentIndex = 0;
	private Integer[] aArray;

	// constructor
	public MyIter(Integer[] newArray) {
		this.aArray = newArray;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		return aArray[currentIndex++ % 3];
	}

}
