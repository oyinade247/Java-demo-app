import java.util.Arrays;
public class CupcakeTest{
	/*public static void main(String[] args){

	int [] number = {1, 2, 3, 5, 8, 16, 40, 21};

	int evenCount = 0;

	int oddCount = 0;

		
	for(int index = 0; index < number.length; index++){
		if(number[index] % 2 == 0){
			evenCount++;
		}
		else{
			oddCount++;
		}
	}
		System.out.println("odd Count " + oddCount);
		System.out.println("even Count " + evenCount);






int [] number = {1, 2, 3, 5, 8, 16, 40, 21};

int [] doubled = new int[number.length];

	for(int index = 0; index < number.length; index++){
		doubled[index] = number[index] * 2;
	}
		System.out.print(Arrays.toString(doubled));



int [] number = {1, 2, 3, 5, 8, 16, 40, 21};

int [] reversed = new int[number.length];

int reservedCount = 0;

	for(int index = number.length-1 ; index >= 0; index--){
		reversed[reservedCount] = number[index];
		 reservedCount++;
		
	}
	System.out.print(Arrays.toString(reversed));

int [] number = {1, 2, 3, 5, 8, 16, 40, 21};

int [] reversed = new int[2];


int highest = number[0];
int lowest = number[0];

	for(int index = 0; index < number.length; index++){
		if(number[index] < lowest){
			lowest = number[index];
			
		}
		else if(number[index] > highest){
			highest = number[index];
			

		}
	
		
	}
	reversed[0] = lowest;
        reversed[1] = highest;
	System.out.println(Arrays.toString(reversed));
	
}*/




public static void main(String [] args){
	int [] number = {1, 2, 3, 5, 8, 16, 40, 21};
	System.out.print(Arrays.toString(filterArray(number, 4)));



}


public static int[] countOddEven(int [] numbers){

	int oddCount = 0;
	int evenCount = 0;

	for(int index = 0; index < numbers.length; index++){
		if(numbers[index] % 2 == 0){
			evenCount++;
		}
		else{
			oddCount++;
		}	

	}
	return new int []{oddCount, evenCount};


}




public static int[] doubleElement(int [] numbers){
	int [] doubled = new int [numbers.length];

	for(int index = 0; index < numbers.length; index++){
		doubled[index] = numbers[index] * 2;		
	}
	return doubled;


}


public static int[] reverseElement(int [] numbers){
	int [] reverse = new int[numbers.length]; 
	int reversedCount = 0;

	for(int index = numbers.length - 1; index >= 0; index--){
		reverse[reversedCount] = numbers[index];
		reversedCount++;

	}
	return reverse;


}


public static int[] findMinMax(int [] numbers){
	int [] reversed = new int[2]; 
	int highest = numbers[0];
	int lowest = numbers[1];


	for(int index = 0; index < numbers.length; index++){
		if(numbers[index] < highest){
			highest = numbers[index];
		}
		else if(numbers[index] > lowest){
			lowest = numbers[index];
		}
		
	}
	reversed [0] = highest;
	reversed [1] = lowest;
	return reversed;


}

public static int[] filterArray(int [] numbers, int number1){

int [] divisible = new int [numbers.length];
int divisibleCount = 0;

	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % number1 == 0){
			divisible[divisibleCount] = numbers[count];
				divisibleCount++;
		}

	}

		return Arrays.copyOf(divisible, divisibleCount);

}



public static int[] getDuplicate(int [] number){
	int dupe = new int [number.length];
	 
	for(int index = 0; index < number.length; index++){
		

	}



}
























}