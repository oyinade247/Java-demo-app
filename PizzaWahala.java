import java.util.Scanner;
public class PizzaWahala{
	public static void main(String [] args){

	  printPizzaType();

	}


public static void printPizzaType(){
		String prompt = """ 
		


		_______________________________________________________________________
		
		|   PIZZA TYPE 		| 	NUMBER OF SLICES 	| PRICE PER BOX|
		________________________________________________________________________
		
		|   SAPA SIZE		|	4			|	2500	|
		________________________________________________________________________

		| 	SMALL MONEY	|        6			|	2900	|
	        |			|				|		|
		_________________________________________________________________________

		|  BIG BOYS 		|	8			|	4000	|
		|_______________________|________________________________________________
		
		|	ODOGWU		|	12			|	5200	|
		|________________________________________________________________________










			PIZZA TYPE MENU

			1 -> Sapa size (4 slices) for 2500
			
			2 -> Small money (6 slices) for 2900

			3 -> Big boys (8 slices) for 4000

			4 -> Odogwu (12 slices) for 5200
			
			5 -> Exit


		""";
		System.out.print(prompt);

		System.out.print("Enter pizza type: ");
		Scanner input = new Scanner(System.in); 
		String pizzaType = input.nextLine();
		switch(pizzaType){
			case "1" : printSapaSize();break;
			case "2" :  printSmallMoney(); break;
			case "3" : printBigBoy();break;
			case "4" : printOdogwu();
			 case "5" : System.out.print("Existing");break;
			default : System.out.print("you entered wrong");printPizzaType();
		

		}

}


public static void printSapaSize(){
		String prompt = """
				SAPA SIZES

				NUMBER OF SLICES -> 4
				PRICES PER BOX -> 2500
			""";

		System.out.print(prompt);

		Scanner input = new Scanner(System.in); 
		System.out.print("How many guest are you coming for your party? ");
		int guest = input.nextInt();

		int box1 = guest / 4;
		if(box1 % guest != 0){
			box1 = box1 +  1;
		}
		 
		int leftOver =  (box1 * 4)- guest ;
		double price = 2500 * box1;
		
		System.out.printf("The number of boxes of pizza to buy is %d %n",box1);
		System.out.printf("The number of leftover slices after serving is %d %n", leftOver);
		System.out.printf("The amount of boxes of pizza to buy is %.2f %n", price);

		
		System.out.print("Press 0 to go back to Pizza menu: ");
		String sapaSize = input.next();
		switch(sapaSize){
			case "0" ->  printPizzaType();
			default -> {System.out.print("You entered wrong"); printSapaSize();}


		}

}


public static void printSmallMoney(){
		String prompt = """
			NUMBER OF SLICES -> 6
			PRICES PER BOX -> 2900
			""";


		System.out.print(prompt);

		Scanner input = new Scanner(System.in); 
		System.out.print("How many guest are you inviting? ");
		int guest = input.nextInt();

		int box1 = guest / 6;
		if(box1 % guest != 0){
			box1 = box1 +  1;
		}
		 
		int leftOver =  (box1 * 6)- guest ;
		double price = 2900 * box1;
		
		System.out.printf("The number of boxes of pizza to buy is %d %n",box1);
		System.out.printf("The number of leftover slices after serving is %d %n", leftOver);
		System.out.printf("The price of boxes of pizza to buy is $ %.2f %n", price);



		System.out.print("Press 0 to go back to Pizza menu: ");
		String smallMoney = input.next();
		switch(smallMoney){
			case "0" ->  printPizzaType();
			default -> {System.out.print("You entered wrong"); printSapaSize();}


		}

	}



public static void printBigBoy(){
		String prompt = """
			NUMBER OF SLICES -> 8
			PRICES PER BOX -> 4000
			""";


		System.out.print(prompt);

		Scanner input = new Scanner(System.in); 
		System.out.print("How many guest are you inviting? ");
		int guest = input.nextInt();

		int box1 = guest / 8;
		if(box1 % guest != 0){
			box1 = box1 +  1;
		}
		 
		int leftOver =  (box1 * 8) - guest ;
		double price = 4000 * box1;
		
		System.out.printf("The number of boxes of pizza to buy is %d %n",box1);
		System.out.printf("The number of leftover slices after serving is %d %n", leftOver);
		System.out.printf("The price of boxes of pizza to buy is $ %.2f %n", price);

		System.out.print("Press 0 to go back to Pizza menu: "); 
		String bigBoys = input.nextLine();
		switch(bigBoys){
			case "0" ->  printPizzaType();
			default -> {System.out.print("You entered wrong"); printSapaSize();}


   }
}




public static void printOdogwu(){
		String prompt = """
			NUMBER OF SLICES -> 12
			PRICES PER BOX -> 5200
			""";


		System.out.print(prompt);

		Scanner input = new Scanner(System.in); 
		System.out.print("How many guest are you inviting? ");
		int guest = input.nextInt();

		int box1 = guest / 12;
		if(box1 % guest != 0){
			box1 = box1 +  1;
		}
		 
		int leftOver =  (box1 * 12)- guest ;
		double price = 5200 * box1;
		
		System.out.printf("The number of boxes of pizza to buy is %d %n",box1);
		System.out.printf("The number of leftover slices after serving is %d %n", leftOver);
		System.out.printf("The price of boxes of pizza to buy is $ %.2f %n", price);

		System.out.print("Press 0 to go back to Pizza menu: "); 
		String odogwu = input.next();
		switch(odogwu){
			case "0" ->  printPizzaType(); 
			default ->{ System.out.print("You entered wrong"); printOdogwu();}


   		}
}








	
}