import java.util.*;

public class Exercise05_41 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter numbers: ");
    int enterNum = sc.nextInt();
    int occur = 0;
    int max = enterNum;
    boolean finish = false;
    
    while (finish == false)
    {   
    	if (enterNum != 0)
    	{
    		if (enterNum > max)
    		{
    			max = enterNum;
    			occur ++;
    		}
			
    		else if (enterNum < max)
    		{
    			occur = 0;
    		}
    		enterNum = sc.nextInt();
    	}
    	else if (enterNum == 0)
    	{
    		finish = true;
    	}
    }
    System.out.println("The large number is " + max);
    System.out.println("The occurence count of the largest number is " + occur);
  }
}