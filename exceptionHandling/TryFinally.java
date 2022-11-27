package exceptionHandling;

public class TryFinally {
	public static void main(String[] args) {
		String s =null;
		try {
			s.length();
			} finally { // ducking exception //direct finally block called
			System.out.println("finally block");
		}
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
	}

}
