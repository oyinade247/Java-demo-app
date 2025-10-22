from back_to_sender_functions import calculate_rider_wages
def main_menu(database):
	prompt = """
			BACK TO SENDER LOGISTICS
		=============================================
		|Collection Rate| Amount Per Percel| Base pay|
		_______________________________________________
		|Less than 50%  |    160	    | 5000    |
		_______________________________________________
		|50 -59%	|    200	    | 5000    |
 		_______________________________________________
		|60 - 69 %      |    250	    | 5000    |
 		_______________________________________________
		|70 and above   |    500	    | 5000    |
 		_______________________________________________
		
		
		ENTER ANY OF THE NUMBERS
			
		

			1 => ENTER THE NUMBERS OF PERCELS YOU DELIVERED

			2 => SEE YOUR WAGES 

			3 => Exit
		""";
	print(prompt)
	menu = input("Enter any key from 1 - 4: ")
	match menu:

		case "1" :
			percel = 0

			percel = int(input("Enter the amount of percels you delivered:"))
			records = calculate_rider_wages(database, percel)

			print("Wages has been calculated")
			main_menu(database)


		case "2":
			sum = 0
			for records in database:
				sum += records[1]
				print(f"number of percel: {records[0]} wages: {records[1]}")
			print(f"total wages: {sum}")
			main_menu(database)

		case "3" : print("Exiting....................")



			

			



	







def main():
	
	database = []
	main_menu(database)




main()
	





