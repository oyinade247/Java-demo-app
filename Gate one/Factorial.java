
import java.util.Scanner;
    public class PrimeNumber{
	public static void main(String [] args){

	 Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	     int number = input.nextInt();


	int count = 1;
	
	int sum = 1;

	while(count < number){
 			
		sum += (number - count) * sum ;
		count++;
		}
	System.out.print(sum);

	}
}