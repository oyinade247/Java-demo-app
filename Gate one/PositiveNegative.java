import java.util.Scanner;
    public class PositiveNegative{
	public static void main(String [] args){

	 Scanner input = new Scanner(System.in);

	System.out.print("How many times do you want to input numbers? ");
	int firstNumber = input.nextInt();

	
	int number = 0;
	int positive = 0;
	int negative = 0;
	int zero = 0;
	int count = 0;

	while(count < firstNumber) {
	
		System.out.print("Enter a number");
		number = input.nextInt();

		if(number > 0 ){
			positive++;	
		}
		
		else if(number < 0 ){
             		 negative++;
		}
		
		else{
    			zero++;
		}
		    count++;
            }

	   System.out.println("The positive number count" + positive);
	  System.out.println("The negative number count" + negative);
	System.out.println("The zero number count" + zero);


	
		

   }
}
