	

def calculate_rider_wages(database,percel):
	if type(percel) is not int:
		raise TypeError("Percel must be a number")
	if percel <= 0:
		raise ValueError("Percel number must be positive")
	wages = 0
	records = []
		
	if percel < 50:
		wages = (percel * 160) + 5000
		records = [percel, wages]

	elif percel >= 50 and percel <= 59:
		wages = (percel * 200) + 5000
		records = [percel, wages]

	elif percel >= 60 and percel <= 69:
		wages = (percel * 250) + 5000
		records = [percel, wages]

	elif percel >= 70:
		wages = (percel * 500) + 5000
		records = [percel, wages]

	database.append(records)
	
	return records



		
	






#def get_wages(name,percel,database):

