package exceptionHandling;

public class NestedCatch {
	public static void main(String[] args) throws NumberFormatException {
		String[] arr = {"1","abc",null};
		for(int i=0; i<arr.length;i++) {
			int value =0;//java.lang.NumberFormatException
			try {
				value = arr[i].length()+Integer.parseInt(arr[i]);
			} catch ( NullPointerException e) { //Throwable then it's take error
				System.out.println(e);
			}catch ( Throwable e) {
				System.out.println(e);
			}
			
			System.out.println(value);
		}
		
	}

}
