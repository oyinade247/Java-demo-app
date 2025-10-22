 public class PositiveNegative{
	public static void main(String [] args){

	for(int count = 1; count <= 5; count++){
		System.out.print(" ");

		for(int counter = 1; counter <= count ; counter++) {
			System.out.print("* ");
        	 }
			
		System.out.println(" ");
	}

	System.out.println(" ");


	for(int countTwo = 1; countTwo <= 5; countTwo++){
		System.out.print(" ");

	   	for(int counterTwo = countTwo; counterTwo <= 5; counterTwo++){
			System.out.print("*");
	    	}	
		System.out.println(" ");
	}

	System.out.println(" ");



	for(int countThree = 1; countThree<= 6; countThree++){
	      	System.out.print(" ");
		for(int counterThree = 1; counterThree <= -6; counterThree--){
			System.out.print("*");
	   	}
		
		System.out.println(" ");
	}



	for (int row = 1; row <= 5; row++) {
		System.out.print(" ");

		for (int space = row; space < 5; space++) {
			System.out.print(" ");
		}
		
		for (int space1 = 5; space1 > (5 - row); space1--) {
			System.out.print("*");
		}

		System.out.println();
	}


	for(int countFour = 1; countFour <= 5; countFour++){
	
	}








	}
}