import java.util.*;

public class DigitSum {

	public static void main(String[] args) {
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a number
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		
		//Compute the sum
		int sum = 0;
		for( ; ; )
		{   
			if (num == 0) break;
			sum = sum + Math.abs(num) % 10;
			num = num / 10;
		}
		
		//Display result
		System.out.println("The sum of digits is " + sum);
		
	}

}
