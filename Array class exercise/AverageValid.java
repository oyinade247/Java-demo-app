import java.util.Scanner;
	public class AverageValid{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int [] number = new int[10];

		int sum = 0;
		double total = 0;
		int numberCount = 0;
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number  " );
			number[count] = collector.nextInt();
			 numberCount++;
			if(number[count] > 0 && number[count] < 100){
			 sum += number[count];
			}
			total = sum / numberCount;
		}
		System.out.printf("The sum of the number is %d", sum);
		
		System.out.printf("The average  number is %.2f", total);

				

	}
}
