package exceptionHandling;

import java.util.Scanner;

class Exception {
 public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the  1st number");
	System.out.println(sc.nextInt());//if user put string like abc that time error occurs
	                                 //java.util.InputMismatchException

}
}