
public class Exercise06_29 {

	public static void main(String[] args) {
		for (int num = 3; num <= 998; num ++)
		{
			if ((isPrime(num) == true) && (isPrime(num + 2) == true))
			{
				System.out.printf("(%d, %d)", num, num + 2);
				System.out.println("");
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
}
