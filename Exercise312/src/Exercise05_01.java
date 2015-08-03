import java.util.*;

public class Exercise05_01 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter an integer, the input ends if it is 0: ");
    System.out.println("");
    int firstNum = input.nextInt();
    
    int num = firstNum;
    int posCount = 0;
    int negCount = 0;
    int totalCount = 0;
    double total = 0;
    double avg;
    
    if (firstNum != 0)
    {
    	while (num != 0 )
    	{
            if (num > 0)
            {
            	posCount ++;
            }
            else
            {
            	negCount ++;
            }
            total = total + num;
            totalCount ++;
    		num = input.nextInt();
    	}
    }
    else
    {
    	System.out.println("No numbers are entered except 0");
    }
    avg = total / totalCount;
	System.out.println("The number of positives is "+ posCount);
	System.out.println("The number of negatives is " + negCount);
	System.out.println("The total is "+ total);
	System.out.println("The average is "+ avg);
  }
}