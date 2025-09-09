import java.util.Scanner;
public class PersonalAssistant{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);


	System.out.print("Enter your name: ");	
	String name = input.nextLine();

	System.out.print("Enter your age: ");	
	int age = input.nextInt();
		
	System.out.print("How are you feeling(happy,sad,excited,tired) today?");	
	String feeling = input2.nextLine();


	System.out.print("Guess any number between 1 - 10: ");	
	int number = input.nextInt();
	
	System.out.print("Do you want a suggestion (yes/no)? ");	
	String suggestion = input.next();

	
	if(age < 13){
	 System.out.printf("Hello %s, You are a young explorer!%n",name);
	}
	else if(age <= 13 && age <= 19){
	 System.out.printf("Hello %s, Teen life is fun! enjoy it!%n",name);
	}
	else if(age <= 20 && age <= 59){
	 System.out.printf("Hello %s, Adulting can be challenging, stay strong!%n", name);
	}
	else if(age <= 60){
	 System.out.printf("Hello %s, Wisdom looks good on you!%n", name);
	}
	else{
	  System.out.printf("Hello %s, Go and marry!%n", name);
	}
	

	switch(feeling){
	case "happy":
	 System.out.println(" keep smiling!"); break;
	
	case "sad":
	 System.out.println(" Cheer up! tommorow is a new day!"); break;
	
	case "excited":
	 System.out.println("Awesome! enjoy your energy!"); break;
	
	case "tired":
	 System.out.println("Rest well and recharge!"); break;

	default :
	  System.out.println(" Go and drink beer!");
	}


	int guess = (int)(Math.random()*10);
	if(number == guess){
	 System.out.print("You are correct my friend!");
	}
	else{
	 System.out.print("You are wrong!");
	}
	
	switch(suggestion){
	case "yes" :
	  System.out.print("Go out and have fun!"); break;
	
	default:
	 System.out.print("Have a great day anyways!");
	}
	

	}
}