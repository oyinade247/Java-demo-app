import java.util.Scanner;
    public class Power{
	public static void main(String [] args){

	 Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter a number: ");
	int numberTwo = input.nextInt();

	
	int count = 1;
	int sum = 1;
	while(count <= numberTwo){
		sum *= numberOne;
			count++;
          
	}
		System.out.print(sum);

	}
}

