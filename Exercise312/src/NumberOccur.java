import java.util.*;

public class NumberOccur {
	public static int Occur(long num, int digit)
	{
		int count = 0;
		while (num > 0)
		{
	      if (num % 10 == digit)
	      {
	    	  count ++;
	      }
	      num = num / 10 ;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Enter the number: ");
		long num = sc.nextLong();
		for (int i = 0; i < 10 ; i ++)
		{   
			int count = 0;
			count = Occur(num, i);
			System.out.println("The digit "+ i + "-- occured "+ count +" times");
		}

	}

}
