/** Analysis: ... */

/** Design: ... */

/** Coding: Please indent and format your code properly */
/** Copy and paste your code to replace the template below */
/** Note that your class must be named Exercise06_27 */

public class Exercise06_27 {

	public static void main(String[] args) {
		int count = 1;
		int num = 13;
		while (count < 100)
		{       
			if ((isPrime(num) == true) && (isPrime(reverse(num)) == true) && (isPalindrome(num) == false))
			{               
		      System.out.print(num + " ");
			  
			  if (count % 10 == 0)
			  {
				  System.out.println();				
			  }	
			  count++;
			  num++;
			  		  
			}
			else
			{
			  num++;
			}
		}
	}
	public static boolean isPrime(int num)
	{
		boolean isPrime = true;
		for (int i = 2; i < num/2; i++)
		{
			if (num % i == 0)
			{
				isPrime = false;
			}
		}
		return isPrime;
		
	}
	public static boolean isPalindrome(int num)
	{
		boolean isPalindrome;
		int lastDigit = num % 10;
		int firstDigit = num;
		while (firstDigit / 10 >= 1)
		{
			firstDigit = firstDigit / 10; 	
		}
		
		if (lastDigit == firstDigit)
		{
			isPalindrome = true;
		}
		else
		{
			isPalindrome = false;
		}
		return isPalindrome;
	}
	public static int reverse(int num)
	{
		int reverse = 0;
		while (num > 0)
		{
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		return reverse;
	}

}
