import java.util.Scanner;

//Create class Exercies02_13
public class Exercise02_13 
{
    //Create constant interestRate
	private static double interestRate = 0.05 / 12;
	
	//Create constant year
	private static int year = 6;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	  Scanner input = new Scanner(System.in);
	  
	  //Prompt the user to enter monthly payment
	  System.out.print("Enter the monthly saving amount: ");
	  
	  //Create variable year from input
	  double monthlyAmount = input.nextDouble();
	  
	  //Compute the total value after 6 months
      double value;
      value = computeValue(monthlyAmount);
      
      
      System.out.println("After the sixth month, the account value is $" + String.format("%.2f",value));
	}
	
	//Create method computeValue()
	public static double computeValue(double monthlyAmount)
	{
	  double totalAmount = 0.0;
	  for (int i = 1; i < year + 1 ; i++)
	  {
	    totalAmount = ( totalAmount + monthlyAmount) * (1 + interestRate) ;
	  }
	return totalAmount;
	}

}
