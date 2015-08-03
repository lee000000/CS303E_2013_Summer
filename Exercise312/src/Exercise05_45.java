import java.util.*;

public class Exercise05_45 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter ten numbers: ");
    
    double sum = 0;
    double average = 0;
    double numSqrt = 0;
    double sd = 0;
    int count = 1;
    
    while (count <= 10)
    {
      double num = input.nextInt();

      sum = sum + num;
      numSqrt = numSqrt + Math.pow(num, 2);
      count ++;
    }

    average = sum / 10;
    double temp = (numSqrt - Math.pow(sum, 2)/10)/9;
    sd = Math.sqrt(temp);
    System.out.println("The mean is " + average);
    System.out.println("The standard deviation is "+ sd);
  }
}