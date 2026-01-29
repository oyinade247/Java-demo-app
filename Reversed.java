
import java.util.Arrays;
public class Reversed{

	public static void main(String [] args){


	String [] words = {"This is an"};

		

	

	String reversed = "";


	for(int counter = 0; counter < words.length; counter++){
		String word = words[counter];
		String cut = word.substring(0, length() - 1);

		for(int count = word.length () -1 ; count >= 0; count--){

			reversed = reversed + word.charAt(count);
		}
		String remainder = cut.substring(3) ;
		String add =  reversed +  remainder;		
		words[index] = add; 

	}

			System.out.print(Arrays.toString(words));
	}

}