package exceptionHandling;

public class TestExceptionResolve {
	
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		String  s=null;//exception occurs due to null we can't create with object and string
		try {
			
		} catch (NullPointerException e) {
			System.out.println(s.length());//java.lang.NullPointerException
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		
	}

}