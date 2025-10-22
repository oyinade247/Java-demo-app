import java.util.Arrays;
import java.util.Scanner;
public class Cupcake{
	public static void main(String[] args){
		int[] number = {1, 3, 4, 8, 7};
		System.out.print(Arrays.toString(getAscendingOrder(number)));
	}

		
public static int[] getSmallest(int[] number){

	int smallest = number[0];
	

	for(int count = 0; count < number.length; count++){
		if(number[count] < smallest){
			smallest = number[count];
		}
	
	}
	return new int[] {smallest};	
}


public static double[] getAverage(int[] number){

	int numberCount = 0;
	int sum = 0;
	int result = 0;

	for(int count = 0; count < number.length; count++){
		sum += number[count];
		numberCount++;
	}
	result = sum / numberCount;

	return new double [] {result};
}

public static int[] getOccurence(int[] number, int targetNumber){

	int countTargetNumber = 0;
	

	for(int count = 0; count < number.length; count++){
		if(number[count] == targetNumber){
			countTargetNumber++;
		}
	}
	return new int []{countTargetNumber};
}

public static boolean getElement(int[] number, int targetNumber){
	int countTargetNumber = 0;
	for(int count = 0; count < number.length; count++){
		if(number[count] == targetNumber){
			countTargetNumber++;
		}
	}
	return  true;
}


public static int[] getFirstElement(int[] number){
	int firstElement = number[0];
	for(int count = 0; count < number.length; count++){
		firstElement = number[0];
	}
	return new int [] {firstElement};
}
	
	

public static int[] getLastElement(int[] number){
	int lastElement = number[0];
	for(int count = 0; count < number.length; count++){
		lastElement = number[count];
	}
	return new int [] {lastElement};
}


public static int[] getLength(int[] number){
	int countElement = 0;
	
	for(int count = 0; count < number.length; count++){
		countElement++;
	}
	
	return new int[] {countElement};
	}


public static int[] getMiddleElement(int[] number){
	int middleElement = 0;
	int position = 0;
	for(int count = 0; count < number.length; count++){
		if(number.length % 2 == 0){
			position = number.length / 2;
			//middleElement = number[position];
			return new int [] {number[position + 1], position};
		}
		else if(number.length % 2 != 0){
			position = (number.length / 2) - 1;
			middleElement = number[position];
		}

	}
	return new int [] {middleElement};

}
	

public static int[] swapFirstAndLast(int [] number){
	int firstElement = number[0];
	int lastElement = number[number.length - 1];
	int [] newArray = new int [number.length];

	for(int count = 0; count < number.length; count++){
		newArray[count] = number[count];
	}
		newArray[0] = lastElement;
		newArray[number.length - 1] = firstElement;

	return newArray;
	
}





	

public static int[] getAscendingOrder(int [] number){
	 int firstElement = number[0];
	 int [] ascending = new int[number.length];
	
	for(int count = 0; count < number.length; count++){
		 if(firstElement > number[count]){					firstElement  = number[count] ;
		}
	}

	return new int [] {firstElement};

}































	
	
}
