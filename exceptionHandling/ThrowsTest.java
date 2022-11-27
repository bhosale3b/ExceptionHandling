package exceptionHandling;

public class ThrowsTest {
	public void one() {
		try {
			two();
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			}
		catch (Throwable e) {
			
			e.printStackTrace();
		}
		System.out.println("one()");
		
	}
    public void two() throws ArithmeticException, Throwable{
    	
			try {
				three();
			} catch (ArithmeticException e) {
			
				e.printStackTrace();
			}catch (Throwable e) {
			
				e.printStackTrace();
			}
		
		
    	System.out.println("two()");
		
	}
    public void three() throws ArithmeticException, Throwable {
    	
    	int c=10/0;
    	System.out.println("three");
	
}
    public static void main(String[] args) {
		System.out.println("main started");
		ThrowsTest t = new ThrowsTest();
		t.one();
		System.out.println("main end");
	}

}
