import java.util.*;

public class Exercise05_21 {

	private static final double INITIALRATE= 0.05;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Loan amount: ");
		double loan = sc.nextDouble();
		
		System.out.print("Num ber of years: ");
		int year = sc.nextInt();
		
		System.out.println("Interest Rate     Monthly Payment     Total Payment");
		System.out.println("");
		
		double monthlyPay = 0;
		double totalPay = 0;
		for (double i = 0; i <= 24; i++)
		{
			double interest = (i * 0.00125 + INITIALRATE)/12;
			monthlyPay = computeMonthly(interest, loan, year);
			totalPay = computeTotal(interest, loan, year, monthlyPay);
			
			System.out.printf("%4.3f%%%19.2f%24.2f", interest*100.0 * 12, monthlyPay, totalPay);
			System.out.println("");
		}
	}
	
	public static double computeMonthly(double i, double loan, int year)
	{
		double monthlyPay = loan * (i/ ( 1 - 1/Math.pow(1 + i, year*12)));
		return monthlyPay;
	}
	
	public static double computeTotal(double i, double loan, int year, double monthlyPay)
	{
		double totalPay = monthlyPay * year * 12;
		return totalPay;
	}

}
