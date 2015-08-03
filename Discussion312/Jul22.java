import java.util.*;


public class Jul22 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		System.out.println("result of rec1 is: " + rec(a, b));
		System.out.println("result of rec2 is: " + rec2(a, b));
		
		rec3("Hello");
		System.out.println("");
		
		for (int i = 1; i <= 5; i ++)
		{
			for (int j = 1; j <= i ; j ++)
			{
				for (int k = 1; k <= 5; k++)
					System.out.print("+");
			}
		}  */
        //evenlySpaced (10, 9 , 11);
		for (int i = 1; i < 6; i ++)
		{
			for (int j = i; j > 0; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
        
	}

	public static int rec (int a, int b)
	{
	  if (a == 0)
	  {
		return 0;  
	  }
	  else
	  {
		  return 1 + rec (a - 1, b);
	  }
	}
	
	public static int rec2 (int a, int b)
	{
		if (a == 0)
		{
			return 0;
		}
		else
		{
			return b + rec2 ( a - 1, b);
		}
	}
	
	public static void rec3 (String str)
	{
		if (str.length() <= 1)
		{
			System.out.print(str);
		}
		else
		{
			rec3(str.substring(1));
			System.out.print(str.charAt(0));
		}
	} 
	public static void evenlySpaced(int a, int b, int c) {
		  int max = ( a <= b) ? (( b <= c ) ? c : b ) : (( b <= c) ? c : b);
		  int min = a <= b ? ( a <= c ?  a : c) : a;
		  int medium = a <= b ? (( c <= a ) ? a : ((c <= b) ? c : b )) : (( b >= c ) ?  b : (a >= c)? c : a);
		  boolean check;
		  
		  if ((max - medium) == (medium - min))
		  {
		    check = true;
		  }
		  else
		  {
		    check = false;
		  }
		  System.out.printf("max is %d, medium is %d, min is %d, check is %s", max, medium, min, check);
		}

}
