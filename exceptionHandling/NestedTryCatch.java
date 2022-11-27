package exceptionHandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		String[] arr = {"1","abc",null};
		for (int i = 0; i < arr.length; i++) {
			try {
			int value = arr[i].length();//nullpointer
			try {
			value=Integer.parseInt(arr[i]);
			}catch( Throwable e) {
				System.out.println("inner catch block"+e);
			}
			System.out.println(value);
		}catch(Throwable e) {
			System.out.println("outer catch block" +e);
		}
			
		} 
	

}
}