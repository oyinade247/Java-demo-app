import java.util.Scanner;

public class NokiaMenu{
	public static void main(String [] args){

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
               
""";
	 System.out.println(prompt);

	Scanner input = new Scanner(System.in);

		System.out.print("Press any key from 1 - 13: ");
     		 int menuFunctions = input.nextInt();

	switch(menuFunctions){

              case 1 -> {
				System.out.println("Phone Book");
				String phoneBookPrompt = """ 
					PHONE BOOK MENU:
				 
			1 -> search
	   	2 -> Service Nos
	  	3 -> Add name
			4 -> Erase
	   	5 -> edit
	  	6 -> Assign tone
	    	7 -> Send  b'card
	    	8 -> options
	    	9 -> Speed dials
	    	10 -> Voice tags
		""";

				 System.out.println(phoneBookPrompt);
				
				System.out.print("Press any key from 1 - 10: ");
					int phoneBookMenu = input.nextInt();
					
		switch(phoneBookMenu){ 
				case 1 -> { System.out.println("Search");}

	   			case 2 -> { System.out.println("Service Nos");}

	  			case 3 ->  { System.out.println("Add name"); }

				case 4 ->  {System.out.println("Erase"); }

	   			case 5 -> { System.out.println("edit");}
				     
	  			case 6 -> {System.out.println("Assign tone");}

	    			case 7 -> {System.out.println("Send b'card");}
				case 8 -> {
						System.out.println("Options");
						String options = """ 
						   		OPTION MENU
								1 -> Type of view 
								2 -> Memory Status
						""";

						  System.out.println(options);
						System.out.print("press any key from 1 - 2: ");
							int optionsPrompt = input.nextInt();

						switch(optionsPrompt){
							case 1 -> { System.out.println("Type of view ");}

	   						case 2 -> {System.out.println("Memory Status"); }
		
								    }

					   }
				case 9 ->  {System.out.print("Speed dials");}
				case 10 ->  {System.out.print("Voice tags");}

				    }

			}

		case 2 -> {
			   System.out.print("Messages");

					String messagePrompt = """ 
					MESSAGE MENU:
				 
			1 -> Write messages
	   	2 -> Inbox
	  	3 -> Outbox
			4 -> Picture messages
	   	5 -> Templates
	  	6 -> Smileys
	    	7 -> Message Settings
	    	a-> Set
	    	i -> Message centre number
	    	ii -> Message sent as
		iii -> Message validity
	    	b -> common 
	    	i -> Deivery reports
		ii -> Reply via same centre
		iii -> Charater support
	        8 -> Info service
	  	9 -> Voice mailbox number
	    	10 -> Service command editor

		""";
					 System.out.println(messagePrompt);

				System.out.print("Press any key from 1 - 10: ");
					int messagePromptOne = input.nextInt();
			
				switch(messagePromptOne){
				case 1 -> {
					   System.out.println("Write messsages");
					  }

	   			case 2 -> { System.out.println("Inbox");}

	  			case 3 ->  { System.out.println("Outbox"); }

				case 4 ->  {System.out.println("Picture messages"); }

	   			case 5 -> { System.out.println("Templates");}
				     
	  			case 6 -> {System.out.println("Smileys");}

	    			case 7 -> {System.out.println("Messages");
						String messages = """ 
						   		MESSAGES MENU
								1 -> Set 1
								2 -> common	
						""";
						System.out.println(messages);
					     System.out.print("Press any key from 1 - 2: ");
					    int messageFirst = input.nextInt();
	
							
								
					switch(messageFirst){
							case 1 -> {System.out.println("Set");

						System.out.print("press any key from 1: ");
							int messagesPromptTwo = input.nextInt();
					 
							
							switch(messagesPromptTwo){
							  case 1 -> {
					  			 System.out.println("Write messsages");

											String writeMessages = """ 
						   					WRITE MESSAGES MENU

											1 -> Message centre number
											2 -> Mesage sent as
											3 -> Message validity
										""";
										System.out.println(writeMessages);

						System.out.print("press any key from 1 - 3: ");
							int writeMessagesPrompt = input.nextInt();
							
							
							switch(writeMessagesPrompt){
							  case 1 -> {System.out.println(" Message centre number");}
							   case 2 -> {System.out.println("Mesage sent as");}
							    case 3 -> {System.out.println(" Message validity");}

										   }
						                             }
										


									
					 		          }
						  



						          }	
							case 2 -> {System.out.print("Common");
								System.out.print("press any key from A - B: ");
							String commonMenu = input.next();
					 
								String common = """
						                
						   			COMMON MENU
								1 -> delivery report
								2 -> Reply via same centre
								3 -> character report	
						""";
						          System.out.println(common);
								
						System.out.print("press any key from 1 - 3: ");
							int commonMenulist = input.nextInt();


						switch(commonMenulist){
							  case 1 -> {System.out.println("Delivery report");}
							   case 2 -> {System.out.println("Reply via same centre");}
							    case 3 -> {System.out.println("Character report");}


				
									

								}

			
							   }
								

						}
					    
				}
		


	
		 }
							   										    

	}			   
		           
				
case 3 -> {  System.out.println("Chat");}
			  

case 4 -> {System.out.println("Call register");
		
					String callPrompt = """ 
						CALL REGISTER MENU:
				1 -> missed calls
	   			2 -> received calls
	  			3 -> dialled numbers
				4 -> erassed call lists
				5 -> show call duration

			""";
                  		System.out.println(callPrompt);
					System.out.print("Press any key from 1 - 10: ");
					int callPromptOne = input.nextInt();
			
				switch(callPromptOne){

				case 1 -> {
					   System.out.println("missed calls");
					  }

	   			case 2 -> { System.out.println("receive calls");}

	  			case 3 ->  { System.out.println("Dialled number"); }

				case 4 ->  {System.out.println("Erased call lists"); }

	   			case 5 -> { System.out.println("Show call duration");
				 	    String callDuration = """ 
						   		CALL DURATION MENU
								1 -> Last call duration
								2 -> All cals duration
								3 -> Received calls duration
								4 -> Dialled calls duration
								4 -> clear timers

	
									
						""";
						System.out.println(callDuration);


				          }

					


			}		
				 

	  }









  }
}
}