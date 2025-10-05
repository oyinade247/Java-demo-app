import java.util.Scanner;
public class KataTest{ 
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter any number: ");
	 int numberOne = input.nextInt();

	//System.out.print("Enter any number: ");
	 //int numberTwo = input.nextInt();

	//int result = Kata.getPositiveDifference(numberOne, numberTwo);
	boolean prime = Kata.isPrimeNumber(numberOne);

	System.out.print(prime);

	
	
	}
}
