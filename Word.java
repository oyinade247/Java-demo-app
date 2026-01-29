import java.util.Arrays;
public class Word{

		public static void main(String [] args){
			String word = "hello world";
				System.out.println(sentence(word));
			int number = 120;
			response(number);

			int [] number1 = {4,2,8,1,12};
				System.out.println(Arrays.toString(largestNumber( number1)));

			int [] number2 = {4,2,8,1,12};
				System.out.println(Arrays.toString( sortedNumber( number2)));


			


		

		}

	
	public static String sentence(String word){

	return word;
	}



	public  static void response(int number){

		for(int count = 1; count <= number; count++){


			if(count % 4 == 0 && count % 6 == 0){
					System.out.println("Hello world");
			}

			else if(count % 4 == 0){
				System.out.println("Hello");
				continue;
			}
			
			else if (count % 6 == 0){
				System.out.println("World");
				continue;
			}

			
			
			System.out.println(count);
		}

		


	}



	public static int[] largestNumber(int [] number){

		int largest = 0;

			for(int count = 0; count < number.length; count++){
				if(number[count] > largest){
				largest = number[count];
			}
	
		}
		return new int[] {largest};	

		}




	public static int[] sortedNumber(int [] number){

		for(int count = 0; count < number.length; count++){

		for(int counter = 0; counter < number.length - 1 - count; counter++){
			if(number[counter] > number[counter + 1]){
			int temp = number[count];
			number[count] = number[counter + 1];
			number[counter + 1] = temp;
			
			}

			}

		}
		return number;
	}

	







}