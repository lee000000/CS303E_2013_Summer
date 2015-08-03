import java.util.*;

public class Exercise3_01 {

	public static void main(String[] args) {
		//Prompt the user to enter a, b, c
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
	    //Compute the discriminant
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		//Print out result
		//Formatting refers to Table 4.12 of Textbook (System.out.printf)
		if (discriminant < 0)
		{
			System.out.println("No Roots");
			System.out.println();
		} 
		else if (discriminant == 0)
        {		
			double root = computeRootOne(a, b, c);
			System.out.printf("There is one root %6f" , root);
			System.out.println();
		}
		else if (discriminant > 0)
        {
        	double root1 = computeRootOne(a, b, c);
        	double root2 = computeRootTwo(a, b, c);
        	System.out.printf("The roots are %6.4f and %4f", root1, root2);
        	System.out.println();
        }
        
	}
	
	//Compute first root if exists
	public static double computeRootOne(double a,double b, double c)
	{
	   double value = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5))/(2 * a);
	   return value;
	}
	
	//Compute second root if exists
	public static double computeRootTwo(double a, double b, double c){
		double value2 =( -b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5))/(2 * a);
		return value2;
	}

}
