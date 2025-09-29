import java.util.Scanner;
    public class PrimeNumber{
	public static void main(String [] args){

	 Scanner input = new Scanner(System.in);

	int count = 1;
	int number = 0 ;

	while(count <= 1 ){

	 	System.out.print("Enter a positive number: ");
		number = input.nextInt();
		count++;

		if(number % 2 == 0){
			
		System.out.print("it is not a prime number");
		}

		else{
		   System.out.print("It is a prime number");
		}
		

	  }
	 
	}
   	
}