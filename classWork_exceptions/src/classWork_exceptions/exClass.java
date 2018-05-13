package classWork_exceptions;

public class exClass {

	public static void main(String[] args) {
		// f2(5);
		try {
			aMethod();
		} catch (XisFiveException e) {
			e.printStackTrace();
		}
	}

	public static void aMethod() throws XisFiveException {
		throw new XisFiveException();
	}

	/*
	 * public static void aMethod() { try { System.out.println("throw"); throw new
	 * XisFiveException(); } catch (XisFiveException e) { e.printStackTrace(); } }
	 */

	/*
	 * public static void f2(int x) { try { System.out.println("try"); f1(x); }
	 * catch (XisFiveException e) { System.out.println("catch"); f2(x+1); } }
	 * 
	 * 
	 * public static void f1(int x) throws XisFiveException { if (x == 5) {
	 * System.out.println("throw"); throw new XisFiveException(); } else {
	 * System.out.println("Done!"); }
	 * 
	 * }
	 */

}
