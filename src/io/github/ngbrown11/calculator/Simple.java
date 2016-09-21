package io.github.ngbrown11.calculator;

//Five-function calculator

/* A class to hold five mathematical functions:
 * 
 * 		*Finding the sum of multiple numbers
 * 		*Finding the difference between multiple numbers
 * 		*Finding the product of multiple numbers
 * 		*Finding the quotient of multiple numbers
 * 		*Finding the remainder between two numbers
 * 
 * This class is useful for performing these simple mathematical functions. 
 * 
 * */

class Simple {
	
	//Compute the sum of int type numbers
	static int add(int...numbers) {
		
		int sum = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	//Compute the sum of double type numbers
	static double add(double...numbers) {
		
		double sum = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	//Compute the difference of int type numbers
	static int subtract(int...numbers) {
		
		int difference = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			difference -= numbers[i];
		}
		return difference;
	}
	//Compute the difference of double type numbers
	static double subtract(double...numbers) {
		
		double difference = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			difference -= numbers[i];
		}
		return difference;
	}
	//Compute the product of int type numbers
	static int multiply(int...numbers) {
		
		int product = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			product *= numbers[i];
		}
		return product;
	}
	//Compute the product of double type numbers
	static double multiply(double...numbers) {
		
		double product = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			product *= numbers[i];
		}
		return product;
	}
	//Compute the quotient of int type numbers
	static int divide(int...numbers) {
		
		int quotient = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			quotient /= numbers[i];
		}
		return quotient;
	}
	//Compute the quotient of double type numbers
	static double divide(double...numbers) {
		
		double quotient = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			quotient /= numbers[i];
		}
		return quotient;
	}
	//Compute the remainder of int type numbers
	static int modulo(int a, int b) {
		
		int remainder = a % b;
		return remainder;
	}
	//Compute the remainder of double type numbers
	static double modulo(double a, double b) {
		
		double remainder = a % b;
		return remainder;
	}
	
}
