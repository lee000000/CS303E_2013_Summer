import java.util.*;

public class Exercise06_39 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter three points for p0, p1, and p2: ");
    double x0 = sc.nextDouble();
    double y0 = sc.nextDouble();
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();
 
    if (leftOfTheLine(x0, y0, x1, y1, x2, y2) == true)
    {
      System.out.printf("(%2.1f, %2.1f) is on the left side of the line from (%2.1f, %2.1f) to (%2.1f, %2.1f)", x0 , y0, x1, y1, x2, y2);
    }

    else if (rightOfTheLine(x0, y0, x1, y1, x2, y2) == true)
    {
      System.out.printf("(%2.1f, %2.1f) is on the right side of the line from (%2.1f, %2.1f) to (%2.1f, %2.1f)", x0 , y0, x1, y1, x2, y2);
    }

    else if (onTheSameLine(x0, y0, x1, y1, x2, y2) == true)
    {
      if( (x2 <= Math.max(x0,x1) && x2 >= Math.min(x0,x1)) && y2 <= Math.max(y0, y1) && y2 >= Math.min(y0,y1))
        {
          System.out.printf("(%2.1f, %2.1f) is on the line segment from (%2.1f, %2.1f) to (%2.1f, %2.1f)", x0 , y0, x1, y1, x2, y2);
        }
     else
        {
          System.out.printf("(%2.1f, %2.1f) is on the same line from (%2.1f, %2.1f) to (%2.1f, %2.1f)", x0 , y0, x1, y1, x2, y2);
        }
    }
 
}
  public static boolean leftOfTheLine (double x0, double y0, double x1, double y1, double x2, double y2)
  {
    boolean left;
    double check = (x1 - x0) * (y2 - y0) - (x2 - x0)*(y1 - y0);
    if (check > 0)
    {
      left = true;
    }
    else
    {
      left = false;
    }
    return left;
  }

  public static boolean onTheSameLine (double x0, double y0, double x1, double y1, double x2, double y2)
  {
    boolean same;
    double check = (x1 - x0) * (y2 - y0) - (x2 - x0)*(y1 - y0);
    if (check == 0)
    {
      same = true;
    }
    else
    {
      same = false;
    }
    return same;
  }
  public static boolean rightOfTheLine (double x0, double y0, double x1, double y1, double x2, double y2)
  {
    boolean right;
    double check = (x1 - x0) * (y2 - y0) - (x2 - x0)*(y1 - y0);
    if (check < 0)
    {
      right = true;
    }
    else
    {
      right = false;
    }
    return right;
  }
}