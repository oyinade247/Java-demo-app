import java.util.Scanner;
	public class SmallestNumber{
		public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int [] number = new int[5];

		int smallest = [0]

		for(int count = 0; count < number.length; count++){
			System.out.print("Enter a number  " );
			number[count] = collector.nextInt();
			

			if(number[count]) < smallest[count]){
				smallest = number[count];
			}

			
		}
		

		
		System.out.printf("The smallest number is %d", smallest);
		
	
				

	}
}
