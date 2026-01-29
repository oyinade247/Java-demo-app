import java.util.Arrays;

public class LowestCommonMultiples{

	public static void main(String [] args){
		int [] numbers = {2,4};
		System.out.print(lowestCommon(numbers));

	}

	public static int lowestCommon(int[] numbers) {
	int lowest = numbers[0];
	for (int count = 1; count < numbers.length; count++) {
		int number1 = lowest;
		int number2 = numbers[count];
		int highestNumber;

		if (number1 > number2) {
			highestNumber = number1;
		} 
		else {
		highestNumber = number2;
	}
	int number = highestNumber;
		while (true) {
			if (number % number1 == 0) {
			if (number % number2 == 0) {
				break;
                    }
                }
		number++;
            }
		lowest = number;
        }
	return lowest;
    }





}