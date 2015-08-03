import java.util.*;

public class Exercise04_07 {
  private static final double ANGLEI = 0.1 * Math.PI;
  private static final double ANGLEII = 0.3 * Math.PI;

  public static void main (String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the radius of the bounding circle: ");
    double r = input.nextDouble();
    
    
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double x4;
    double y4;
    double x5;
    double y5;

    //Compute the coordinates
    x1 = 0; y1 = r;
    x2 = r * Math.cos(ANGLEI);
    y2 = (-r) * Math.sin(ANGLEI);
    x3 = -x2;
    y3 = y2;
    x4 = - r * Math.cos(ANGLEII);
    y4 = - r * Math.sin(ANGLEII);
    x5 = -x4;
    y5 = y4;

    //Display results
    System.out.printf("The coordinates of five points on the pentagon are:\n(%.4f, %.4f)\n(%.4f, %.4f)\n(%.4f, %.4f)\n(%.4f, %.4f)\n(%.4f, %.4f)\n", x3, y3, x1, y1, x2, y2, x4, y4, x5, y5);
  }

}