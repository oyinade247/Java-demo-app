public class lowest{

public static void main(String [] args){
	int [] arrays = {2,4,5};

	System.out.print(lowest(arrays));
}

public static int lowest(int [] numbers){
	int highest =  numbers[0];
	for(int count = 0; count < numbers.length; count++){
		if(numbers [count] > highest){
			highest  = numbers[count];

		}
	}

	int lcm = highest;

	for(int counter = 0; counter < numbers.length; counter ++){
		if(lcm % numbers[counter] != 0){
			lcm += highest;
			counter --;

		}
	}
	return lcm;	

}




}