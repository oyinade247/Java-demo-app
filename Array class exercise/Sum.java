import java.util.Scanner;
	public class Sum{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int [] score = new int[10];

		int sum = 0;
		for(int count = 0; count < 10; count++){

			System.out.print("Enter a number");
			score[count] = collector.nextInt();

			sum += score[count];
		}
		System.out.printf("The sum of the numbers is %d", sum);

		

	}
}

