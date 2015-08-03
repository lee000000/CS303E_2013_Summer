import java.util.*;

public class Exercise03_22 {
    //Constant RADIUS
	private static final double RADIUS = 10;

	public static void main(String[] args) {
	  //Prompt user to enter the coordinate
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a point with two coordinates: ");
	  double x = input.nextDouble();
	  double y = input.nextDouble();
	  
	  //Compute the distance from the point to origin
	  double distance = Math.pow( (Math.pow(x, 2) + Math.pow(y, 2)) , 0.5);
	  
	  //Print out the result
	  if (distance <= RADIUS)
	  {
		  System.out.println("Point (" + x + ", " + y +") is in the circle");
	  }
	  else
	  {
		  System.out.println("Point (" + x + ", " + y +") is not in the circle");
	  }
      
	}

}
