 public class DivisibleByThree{
	public static void main(String [] args){

	 int count = 1;
	 int sum = 0;
	while(count <= 30){
		if(count % 3 == 0){
			sum += count;
			count++;
		 }
	}
	System.out.print(sum);
         

	}
}