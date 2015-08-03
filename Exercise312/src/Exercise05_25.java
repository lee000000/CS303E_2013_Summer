
public class Exercise05_25 {
  public static void main(String[] args)
  {  
    double pi = 0;
    for (int i = 10000; i <= 100000; i = i + 10000)
    {  
      pi =4 *computeInner(i);
      System.out.println("PI is " + pi);
    }
  }
  public static double computeInner(double i)
  {
	  double sum = 0;
	  for (int j = 1; j <= i; j ++)
	  {
		  sum = sum + Math.pow(-1, j+1)/(2*j - 1);
	  }
	  return sum;
  }
}