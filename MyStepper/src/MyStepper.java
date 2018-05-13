import java.util.Iterator;

public class MyStepper implements Iterator<Integer> {
	int state = 0;
	int step;
	
	public MyStepper(int Step) {
		this.step = Step;
	}
	
	
	public static void main(String[] args) {
		for (Iterator<Integer> sIter = new MyStepper(5); sIter.hasNext();) {
			System.out.print(" " + sIter.next());
		}
		System.out.println();
		
		for (Iterator<Integer> sIter = new MyStepper(3); sIter.hasNext();) {
			System.out.print(" " + sIter.next());
		}
		System.out.println();
	}
	
	@Override
	public boolean hasNext() {
		if  (state < 50) {
			return true;
		}
		
		return false;
	}
	@Override
	public Integer next() {
		return state += step;
	}
	

	
}
