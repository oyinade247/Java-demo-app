import java.util.Scanner;
	public class SumInBetweenNumber{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int [] number = new int[10];

		int sum = 0;
		int total = 0;
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number  " );
			number[count] = collector.nextInt();
			if(number[count] > 0 && number[count] < 100){
			 sum += number[count];
			}
			
		}
		System.out.printf("The sum of the number is %d", sum);
		
				

	}
}
