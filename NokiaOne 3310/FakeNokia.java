import java.util.Scanner;

public class FakeNokia{

	public static void main(String[] args){

	 mainMenu();

	}


    public static void mainMenu(){
	
	Scanner input  = new Scanner(System.in);

	String prompt = """

             WELCOME TO YOUR NOKIA PHONE

		YOUR NOKIA PHONE MENU:
                  PRESS:
	    1 -> Phone book
	    2 -> messages
	    3 -> Chat
	    4 -> Call register
	    5 -> Tones
	    6 -> Settings
	    7 -> call divert
	    8 -> Games
	    9 -> Calulator
	    10 -> Reminders
	    11 -> Clock
	    12 -> Profiles
	    13 -> SIM services
	    14 -> Exit
               
		""";

	System.out.println(prompt);

	System.out.print("Press any key from 1 - 13: ");
    	String menuFunctions = input.nextLine();

	switch(menuFunctions){
				case "1" : printPhoneBook(); break;
				case "2" : printMessages(); break;
				case "3" : printChat(); break;
				case "4" : printCallRegister(); break;
				case "5" : printTones(); break;
				case "6" : printSettings();break;
				case "7" : printCallDivert();break;
				case "8" : printGames();break;
				case "9" : printCalculator();break;
				case "10": printReminder();break;
				case "11": printClock();break;
				case "12" : printProfiles();break;
				case "13" : printSimServices();break;
				case "14": System.out.println("exiting..."); break;
				default : System.out.print("shine your eyes..Oga,enter better number");break;

				}					 

	}


	public static void printPhoneBook(){
		System.out.println("PhoneBook");

		System.out.println(""" 
		PHONE BOOK MENU:
				 
		1 : search
		2 : Service Nos
		3 : Add name
		4 : Erase
		5 : edit
		6 : Assign tone
		7 : Send  b'card
		8 : options
		9 : Speed dials
		10 : Voice tags
		11 : Exit
		""");



		System.out.print("press any key from 1-10: ");
		Scanner input  = new Scanner(System.in);
		String phoneBookBaby = input.nextLine();
		switch(phoneBookBaby){
				case "0" : mainMenu();
				default : break;
			}


			switch(phoneBookBaby){
				case "1" : printSearch(); break;
				case "2" :  printService();break;
				case "3" : printAddName();break;
				case "4" : break;
				case "5" : break;
				case "6" : break;
				case "7" : break;
				case "8" : break;
				case "9" : break;
				default : System.out.print("Exiting....");break;
			}

		
					
		}


		public static void printSearch(){
			System.out.println("Search");

			System.out.print("press 0 for phonebook menu : ");
			Scanner input  = new Scanner(System.in);
			String search = input.nextLine();
			switch (search) {
				case "0": printPhoneBook(); break;
				default: System.out.print("Exiting..."); break;
			}
		}

		public static void printService(){
			System.out.println("Service Nos");

			System.out.print("press 0 for phoneBook menu : ");
			Scanner input  = new Scanner(System.in);
			String service = input.nextLine();
			switch(service){
				case "0" : printPhoneBook(); break;
				default : System.out.print("Exiting...");break;

			}
		}

		public static void printAddName(){
			System.out.println("Add name");

			System.out.print("press 0 for menu : ");
			Scanner input  = new Scanner(System.in);
			String addName = input.nextLine();
		mainMenu();
		}

		public static void printErase(){
			System.out.println("Erase");

			System.out.print("press 0 for menu : ");
			Scanner input  = new Scanner(System.in);
			String addName = input.nextLine();
		mainMenu();
		}





	public static void printMessages(){
		System.out.println("Messages");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String Messages = input.nextLine();
	mainMenu();
	}


	public static void printChat(){
		System.out.println("Chat");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String chat = input.nextLine();
	mainMenu();
	}


	public static void printCallRegister(){
		System.out.println("Call register");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String callRegister = input.nextLine();
	mainMenu();
	}


	public static void printTones(){
		System.out.println("Tones");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String tones = input.nextLine();
	mainMenu();
	}


	public static void printSettings(){
		System.out.println("Setting");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String settings = input.nextLine();
	mainMenu();
	}


	public static void printCallDivert(){
		System.out.println("Call divert");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String callDivert = input.nextLine();
	mainMenu();
	}


	public static void printGames(){
		System.out.println("Games");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String games = input.nextLine();
	mainMenu();
	}


	public static void printCalculator(){
		System.out.println("Calculator");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String calculator = input.nextLine();
	mainMenu();
	}


	public static void printReminder(){
		System.out.println("Reminder");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String reminder = input.nextLine();
	mainMenu();
	}


	public static void printClock(){
		System.out.println("Clock");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String clock = input.nextLine();
	mainMenu();
	}


	public static void printProfiles(){
		System.out.println("Profiles");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String profiles = input.nextLine();
	mainMenu();
	}


	public static void printSimServices(){
		System.out.println("Sim Services");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String sim = input.nextLine();
	mainMenu();
	}



















}


















	