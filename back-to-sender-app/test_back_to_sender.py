from unittest import TestCase
from back_to_sender_functions import calculate_rider_wages

class TestMyFunctions(TestCase):

	def test_that_calculate_wages_function_is_a_type_int(self):
		self.assertRaises(TypeError,calculate_rider_wages, [3],"Oyin")

	def test_that_calculate_wages_function_is_not_less_than_zero(self):
		self.assertRaises(ValueError,calculate_rider_wages,[40], -1 )

	def test_that_cslculate_wages_function_is_adding_records_to_the_database(self):
		actual = calculate_rider_wages([],80)
		expected = [80, 45000]
		self.assertEqual(actual, expected)