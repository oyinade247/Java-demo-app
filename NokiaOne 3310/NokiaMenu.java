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
				i -> last call cost
				ii -> All calls duration
				iii -> Received calls duration
				iv -> Dialled calls duration
				v -> clear times
				 6 -> Show call cost
	  			 i -> Last call cost
				ii -> All calls cost
				iii -> clear counters
				7 -> Call cost settings
				 i -> call cost limit
				ii -> Show cost in
				iii -> clear counters
				8 - > Prepaid credit


					

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
								2 -> All calls duration
								3 -> Received calls duration
								4 -> Dialled calls duration
								5 -> clear timers

	
									
						""";
						System.out.println(callDuration);

						System.out.print("Press any key from 1 - 5: ");
						int callDurationPromptOne = input.nextInt();

						switch(callPromptOne){

								case 1 -> {System.out.println("Last call duration"); }

	   							case 2 -> { System.out.println("All calls duration ");}

	  							case 3 ->  { System.out.println("Received calls duration"); }

								case 4 ->  {System.out.println("Dialled calls duration"); }
								
								case 5 ->  {System.out.println("clear timers"); }
								}

				          }
                          case 6 ->  {System.out.println("Show call cost");
					String  callCost = """
							CALL SHOW MENU:
						1 -> last call cost
						2 -> All calls cost
						3 -> clear counters
							
						""";
					System.out.print(callCost);

				System.out.print("Press any key from 1 - 3: ");
				int callCostPromptTwo = input.nextInt();

			      switch(callCostPromptTwo){
							case 1 -> {System.out.println("Last call cost"); }

	   						case 2 -> { System.out.println("All calls cost ");}

	  						case 3 ->  { System.out.println("Clear counters"); }


							}


				
				     }
				
				case 7 -> {
					System.out.println("call cost setting");
	
						String  costSetting = """
							CALL COST MENU:
						1 -> call cost limit
						2 -> Show cost in
						3 -> clear counter
							
						""";
					System.out.print(costSetting);

						System.out.print("Press any key from 1 - 3: ");
						int costSettingPromptOne = input.nextInt();

			     		 switch(costSettingPromptOne){
								   case 1 -> {System.out.println("call cost limit"); }

	   							   case 2 -> { System.out.println("show cost in");}

	  							  case 3 ->  { System.out.println("Clear counters"); }

 								  }

					
	       				 }

					

				case  8 -> {System.out.println("Prepaid credit");}

				
		}

		
	  }




	
       case 5 ->  {System.out.println("Tones");
				String tonePrompt = """ 
						TONES MENU:
				1 -> Ringing tone
	   			2 -> Ringing volume
	  			3 -> incoming call alert
				4 -> composer
				5 -> Message alert tone
				6 -> keypad tones
				7 -> Warning and games tones
				8 -> Vibrating alert
				9 -> Screen saver
					

			""";
                  		System.out.println(tonePrompt);
					System.out.print("Press any key from 1 - 9: ");
					int tonePromptOne = input.nextInt();

				
			     		 switch(tonePromptOne){
								   case 1 -> {System.out.println("Ringing tone"); }

	   							   case 2 -> { System.out.println("Ringing volume");}

	  							  case 3 ->  { System.out.println("Incoming call alert"); }
									
								   case 4 -> {System.out.println("Composer"); }

	   							   case 5 -> { System.out.println("Message alert tone");}

	  							  case 6 ->  { System.out.println("Keypad tones"); }
									
								  case 7 -> {System.out.println(" Warning and games tones"); }

	   							   case 8 -> { System.out.println("Viberating alert");}

	  							  case 9 ->  { System.out.println("Screen saver"); }




 								  }

			

			
		  }

       case 6 -> {System.out.println("Settings");
			String settingPrompt = """ 
						SETTINGS MENU:
				1 -> call settings
	   			2 -> phone Settings
	  			3 -> Security setting
				4 -> Restore factory settings
				
			""";
			System.out.println(settingPrompt);
					System.out.print("Press any key from 1 - 4: ");
					int callSettingPromptOne = input.nextInt();

			 switch(callSettingPromptOne){
					case 1 -> {System.out.println("call settings");

					           String  callSettings = """
							CALL SETTING MENU:
						1 -> Automatic redial
						2 -> Speed dialing
						3 -> call waiting options
					        4 -> Own number sending
						5 -> phone in line use
						6 -> Automatic answer

							
						""";
					System.out.print(callSettings);

						System.out.print("Press any key from 1 - 6: ");
					int callSettingsPrompt = input.nextInt();

			switch(callSettingsPrompt){
						   
						  case 1 -> {System.out.println("Automatic redial"); }

	   							   case 2 -> { System.out.println("Speed dialing");}

	  							  case 3 ->  { System.out.println("call waiting options"); }
									
								   case 4 -> {System.out.println("Own number sending"); }

	   							   case 5 -> { System.out.println("phone in line use");}

	  							  case 6 ->  { System.out.println("Automatic answer"); }

						   
						          }


						 }
						
						case  2 ->  {System.out.print("Phone settings");
							
								String  phoneSettings = """
							PHONE SETTING MENU:
						1 -> Language
						2 -> cell phone display
						3 -> welcome note
					        4 -> Network selection
						5 -> Lights
						6 -> Confirm SIM service actions

							
						""";
					System.out.print(phoneSettings);


						  System.out.print("Press any key from 1 - 6: ");
					int phoneSettingsPrompt = input.nextInt();

			switch(phoneSettingsPrompt){
						   
						  case 1 -> {System.out.println("Language"); }

	   					  case 2 -> { System.out.println("Cell phone display");}

	  					  case 3 ->  { System.out.println("Welcome note"); }
									
						  case 4 -> {System.out.println("Network selection"); }
						
						 case 5 ->  { System.out.println("light"); }
									
						  case 6 -> {System.out.println("Confirm service action"); }


						}
				



						}
                 				
				    case 3 ->  {System.out.print("Security settings");
						   
								String  securitySettings = """
							SECURITY SETTING MENU:
						1 -> PIN code request
						2 -> call barring service
						3 -> Fixed dialing
					        4 -> Close user group
						5 -> phone security
						6 -> Change access codes

							
						""";
					System.out.print(securitySettings);

						  System.out.print("Press any key from 1 - 6: ");
					int securitySettingsPrompt = input.nextInt();

				switch(securitySettingsPrompt){
						   
						  case 1 -> {System.out.println("PIN code request"); }

	   					  case 2 -> { System.out.println("Call barring service");}

	  					  case 3 ->  { System.out.println("Fixed dialing"); }
									
						  case 4 -> {System.out.println("Close user group "); }
						
						 case 5 ->  { System.out.println("phone  security"); }
									
						  case 6 -> {System.out.println("Change access codes"); }

						  }



						}


				case 4 ->  {System.out.print("Restore factory settings");}


						}
				

			
		  }

		case 7 -> {System.out.print("Call divert");}

		case 8 -> {System.out.print("Games");}

		case 9 -> {System.out.print("Calculator");}

		case 10 -> {System.out.print("Reminders");}
		
		case 11 -> {System.out.print("Clock");
				
				String  clockSettings = """
							 CLOCK MENU:
						1 -> Alarm clock
						2 -> clock settings
						3 -> date setting
					        4 -> Stopwatch
						5 -> Countdown timer
						6 -> Auto update of date and time

							
						""";
						System.out.print(clockSettings);

						  System.out.print("Press any key from 1 - 6: ");
					int clockSettingsPrompt = input.nextInt();

				switch(clockSettingsPrompt){
							   
						  case 1 -> {System.out.println("Alarm clock"); }

	   					  case 2 -> { System.out.println("Clock settings");}

	  					  case 3 ->  { System.out.println("Date setting"); }
									
						  case 4 -> {System.out.println("Stopwatch"); }
						
						 case 5 ->  { System.out.println("countdown timer"); }
									
						  case 6 -> {System.out.println("Auto Update of date and time"); }
	
							}



			  }

		case 12 ->  {System.out.print("Profiles");}
		case 13 ->  {System.out.print("SIM services");}




		



  }
}
}