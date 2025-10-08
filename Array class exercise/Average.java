import java.util.Scanner;
	public class Average{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int [] number = new int[10];

		int sum = 0;
		int totalCount = 10;
		int total = 0;
		for(int count = 0; count < 10; count++){

			System.out.print("Enter a number");
			number[count] = collector.nextInt();

			sum += number[count];
		}

		total = sum / totalCount;
		System.out.printf("The average numbers is %d", total);

		

	}
}

