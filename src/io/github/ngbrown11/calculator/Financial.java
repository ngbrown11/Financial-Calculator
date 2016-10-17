package io.github.ngbrown11.calculator;

public class Financial extends Simple {
	
	public static double futureValue(double presentValue, double interestRate, int years) {
		
		//Compute future value
		double monthlyInterestRate = interestRate/1200;
		double rawFutureValue = presentValue * (Math.pow((1 + monthlyInterestRate), (years * 12)));
		double preFutureValue = (int)(rawFutureValue * 100);
		double futureValue = (double)preFutureValue / 100;
		
		//Return future value
		return futureValue;
	}
	
	public static double presentValue(double futureValue, double interestRate, int years) {
		
		 //Compute present value
		double monthlyInterestRate = interestRate/1200;
		double rawPresentValue = futureValue / (Math.pow((1 + monthlyInterestRate), (years * 12)));
		double prePresentValue = (int)(rawPresentValue * 100);
		double presentValue = (double)prePresentValue / 100;
		
		//Return present value
		return presentValue;
	}
	
	public static double interestRate(double presentValue, double futureValue, double years) {
		
		//Compute interest rate
		double preMonthlyInterestRate = futureValue / presentValue; 
		double monthlyInterestRate = (Math.pow(preMonthlyInterestRate, 1 / (years*12)))-1;
		double interestRate = monthlyInterestRate * 1200;
		
		//Return interest rate
		return interestRate;		
	}
	/*
	public static int years(double presentValue, double futureValue, double interestRate) {
		
		//Compute years
		double monthlyInterestRateBase = interestRate/1200 + 1;
		double preYears = futureValue / presentValue;
		int count = 1;
		
		//Find value for years
		//while((Math.pow(monthlyInterestRateBase, count * 12) != preYears)) {
			
			count++;
		}
		int years = count;
		
		//Return years		
		return years;
	}
	*/
	/*public static void main(String[] args) {
		
		System.out.print(futureValue(1000, 10, 5) + "\n" + presentValue(1645.3, 10, 5) +
				"\n" + interestRate(1000, 1645.3, 5) + "\n" + years(1000, 1645.3, 10));
		
	}*/
}
