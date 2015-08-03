import java.util.*;

public class Exercise03_23 {
    
  //Set the horizontal and vertical boundaries of the rectangle
  private static final double HORIZONTAL = 10.0/2;
  private static final double VERTICAL = 5/2.0;

  public static void main(String[] args)
  {
    //Create Scanner object
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter the point's coordinate
    System.out.print("Enter a point with two coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();

    //Compute if the point is in the rectangle and display the result
    if (Math.abs(x) <= HORIZONTAL && Math.abs(y) <= VERTICAL)
    {
        System.out.println(Math.abs(x) + " " + Math.abs(y));
    	System.out.println("Point (" + x +", " + y +") is in the rectangle");
    } else
    {
    	System.out.println(Math.abs(x) + " " + Math.abs(y));
    	System.out.println("Point (" + x +", " + y +") is not in the rectangle");
    }
  }

}