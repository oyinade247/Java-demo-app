import java.util.Scanner;
	public class SumEvenIndex{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int [] number = new int[10];

		int sum = 0;
		int totalCount = 10;
		int total = 0;
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number  " + (count) );
			number[count] = collector.nextInt();
			if(number[count] % 2 == 0){
			 sum += number[count];
			}
			
		}
		System.out.printf("The sum of the number is %d", sum);
		
				

	}
}

