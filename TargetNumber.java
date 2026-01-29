import java.util.Arrays;

public class TargetNumber{
	public static void main(String [] args){

		int [] number = {3,5,7,10};
		int targetNumber = 8;

		System.out.print(Arrays.toString(target(number,  targetNumber)));


		

		
			

	}
	



/*public static int [] target(int [] number, int targetNumber){

	int [] newNumber = new int[2];
	int number1 = 0;
	int number2 = 0;

	for(int count = 0; count < number.length; count++){
		for(int counter = count + 1; counter < number.length; counter++){

			if((number[count] +  number[counter]) ==targetNumber){
			newNumber[0] = number[count];
			newNumber[1] = number[counter];
			}
		}


	}
	return newNumber;
}*/












	public static int [] target(int [] number, int targetNumber){

	int [] newNumber = new int[2];
	
	for(int count = 0; count < number.length; count++){
		int number1[count] = number[count];
		for(int counter = count + 1; counter < number.length; counter++){
			int number2[counter] = number[counter];
			System.out.print(number2);
		}
		if((number1[count] +  number2[counter]) ==targetNumber){
			newNumber[number.length] = number1;
			newNumber[number.length] = number2;

		}


	}
	return newNumber;
}






















}