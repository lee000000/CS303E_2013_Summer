import java.util.*;

public class Exercise03_19 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    //Prompt the user to get the sides of a triangle
    System.out.print("Enter the three sides of a triangle: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    //Check if the input is valid
    if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2)
    {
      System.out.println("The inputs are not valid.");
    }
    else
    {
      double perimeter = ComputePerimeter(side1, side2, side3);
      System.out.println("The perimeter of the triangle is: " + perimeter);
    }
  }
  
  public static double ComputePerimeter(double x1, double x2, double x3)
  {
    return x1 + x2 + x3;
  }

}