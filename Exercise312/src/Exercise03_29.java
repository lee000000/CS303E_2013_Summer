import java.util.*;

public class Exercise03_29 {

	public static void main(String[] args) {
		//Create new Scanner object
		Scanner input = new Scanner(System.in);
		
		//Take user's inputs and get the coordinates of the circles' center
		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double centerX1 = input.nextDouble();
		double centerY1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double centerX2 = input.nextDouble();
		double centerY2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		//Compute the distance between the circles
        double dist = Math.pow((Math.pow(centerX2 - centerX1, 2) + Math.pow(centerY2 - centerY1,  2)), 0.5);
        
        //Display the result by conditions
        if (dist <= Math.abs(radius1 - radius2))
        {
          if (radius1 >= radius2)
          {
        	  System.out.println("circle2 is inside circle1");
          }
          else
          {
        	  System.out.println("Circle1 is inside circle2");
          }
        }
        else if ((dist > Math.abs(radius1 - radius2)) && dist <= radius1 + radius2)
        {
        	System.out.println("circle2 overlaps%\n circle1");
        }
        else
        {
        	System.out.println("circle2 does not overlap circle1");
        }
	}

}
