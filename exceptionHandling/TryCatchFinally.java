package exceptionHandling;

public class TryCatchFinally {
	public static int returnvalue() {
		String s = null;
		try {
			s.length();
			System.out.println("inside try block");
			return 10;
			
		} catch (Throwable e) {
			// u can put NullPointerException inreplace throwable is subclass of all exception
			System.out.println("inside catch block");
			System.out.println(e);
			return 20;
		} finally {
			System.out.println("inside finally block");
		}
		
	
		
	}public static void main(String[] args) {
		int value =returnvalue();
		System.out.println(value);
	}

}
