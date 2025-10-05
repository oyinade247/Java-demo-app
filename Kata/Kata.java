public class Kata{

	public static boolean isEven(int number){
		if(number % 2 == 0){
		return true;
		}
		return false;

	}
		



	public static boolean isPrimeNumber(int number){
		for(int count = 2; count < number; count++){
			if(number % count == 0){
				return false;
			}

		}
		return true;
	}

	
	public static int getPositiveDifference(int number1, int number2){
		int  store = 0;
		if(number1 < number2){
			 store = number2 -number1;
			 return store;
		}
		 else if(number2 < number1){
			store = number1 - number2;

		}
		return store;
	}

	
	
	public static float getQuotient(int number1, int number2){
		int store = number1 % number2;
		return store;
	
	}


	public static int getFactorOf(int number1){
		int countFactor = 0;
	    	for(int count = 1; count < number1; count++){
			if(number1 % count == 0){
				countFactor++;
				
			}
		}
		return countFactor;
			
	}

	public static boolean isSquare(int number1){
		double square = Math.sqrt(number1);
		if(square * square == number1){
			return true;
		} 
		return false;

	}


	public static boolean isPalindrome(int number){
	
         String dividedNumber = "";

	 while(number > 0){
		int remainder = number % 10;
		dividedNumber += remainder;
		number /= 10;	
		
		
	  }
		int convertString = Integer.parseInt(dividedNumber);

		if(number == convertString){
			System.out.println("It is a palindrome");
			return true;
		
			
		}

		return false;
	   
	}


	public static long getFactorial(int number){
		int sum = 1;
		for(int count = 1; count < number; count++){
			sum += (number - count) * sum;
		}
			return sum;
	}


	public static long getSquare(int number){
		int store = number * number;
			return store;
	}


	
	



	


	


	





}