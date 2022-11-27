package exceptionHandling;

public class ThrowsChild extends ThrowsParent{
	
	public static void one() throws NullPointerException {
		System.out.println("one() in parent class");
	}

	
	public static void main(String[] args) {
		ThrowsParent pc =new ThrowsChild ();
		try {
			pc.one();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}

}
