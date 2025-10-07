import java.util.Scanner;
	public class SumEvenAverage{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int [] number = new int[10];

		int sum = 0;
		int totalCount = 0;
		double total = 0;
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number  " );
			number[count] = collector.nextInt();
			 	totalCount++;
			if(number[count] % 2 == 0){
			 sum += number[count];
			}
			total = sum / totalCount;

		}
		System.out.printf("The sum of the number is %d%n", sum);
		System.out.printf("The average even numbers is %.2f", total);

		
				

	}
}
