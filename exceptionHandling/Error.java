package exceptionHandling;

public class Error {
	public static void one() {
		System.out.println("Hello");
		one();//called till infinite  // stackOverFlowError// called in same method
		
	}
	public static void main(String[] args) {
		one();
	}

}
