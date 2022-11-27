package exceptionHandling;

public class Test {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		String s=null;//exception occurs due to nullwe can't create with object and string
		System.out.println(s.length());//java.lang.NullPointerException
		
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		
	}

}
