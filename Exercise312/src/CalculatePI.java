//Import the utility package
import java.util.*;

//Create class CalculatePI.java
public class CalculatePI
{
   //Set the radius of the circle as constant
    public static final double RADIUS = 2.0;

  //Create Main method
  public static void main(String[] args)
  {
    //Create new Random object
    Random randomGen = new Random (System.currentTimeMillis());

    //Create  xPos and yPos variables
    double xPos = ( randomGen.nextDouble() ) * 2 - 1.0;
    double yPos = ( randomGen.nextDouble() ) * 2 - 1.0;
   
    System.out.println("Computation of PI using Random Numbers");
    System.out.println("");
    
    //Calculate PI and difference with actual PI with different number of throws
    for (int i = 100; i <= 100000; i = i * 10)
    {
      double PI = computePI(i);
      double diff = PI - Math.PI;
      System.out.print("Number of throws = %d, Computed PI = %f, Difference = %f", i, PI, 

diff);
      System.out.print("");
    }
   
    System.out.println("* Difference = Computed PI - Math.PI");
  }

  //This method calculate PI for given number of throws
  public static double computePI(int throws)
  {
    int count = 0;
    for (int i = 0; i <= throws; i++)
    {
      //Check if the point is in the circle
      boolean check = isInside(xPos, yPos);
      
      if (check == true)
      {
        count ++;
      }
    }
    double PI = (double) count / throws;
    return PI;
  }

  //This method check if a given point is in the circle
  public static boolean isInside (double xPos, double yPos)
  {
    if (Math.sqrt (xPos * xPos + yPos * yPos) <= RADIUS)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}