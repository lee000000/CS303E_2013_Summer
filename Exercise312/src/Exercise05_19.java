
public class Exercise05_19 {
	
	private static final int LAST = 7;
	
	public static void main(String[] args) {
		for (int i = 0 ; i <= LAST ; i++)
		{
			printSpace(i);
			printLine(i);
			System.out.println("");
		}
	}
	
	public static void printSpace(int i)
	{
		for (int j = LAST - i + 1; j >= 1; j--)
		{
			System.out.print("    ");
		}
	}
	
	public static void printLine(int i)
	{
		for (int j = 0; j <= i; j ++)
		{   
			if (Math.pow(2, j)< 10)
			{
				System.out.print("   " + (int)Math.pow(2, j));
			}
			else if ((Math.pow(2,j)) < 100 && Math.pow(2,j)>=10)
			{
				System.out.print("  " + (int)Math.pow(2, j));
			}
			else
			{
				System.out.print(" " + (int)Math.pow(2, j));
			}
		}
		for (int j = i - 1; j >= 0; j--)
		{
			if (Math.pow(2, j)< 10)
			{
				System.out.print("   " + (int)Math.pow(2, j));
			}
			else if ((Math.pow(2,j)) < 100 && Math.pow(2,j)>=10)
			{
				System.out.print("  " + (int)Math.pow(2, j));
			}
			else
			{
				System.out.print(" " + (int)Math.pow(2, j));
			}
		}
	}

}
