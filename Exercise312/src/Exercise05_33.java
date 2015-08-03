public class Exercise05_33 {
  public static final int LAST = 10000;

  public static void main(String[] args)
  {
    

    for (int i = 1; i <= LAST; i++)
    { 
      int divisor = 1;
      int sum = 0;
      while (divisor < i )
      {
        if (isDivisor(divisor, i) == true)
        {
          sum = sum + divisor;
        }
        divisor ++;
      }
      if (sum == i)
      {
        System.out.println(i);
      }
    }
  }
  public static boolean isDivisor(int divisor, int i)
  {
    if (i % divisor == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}