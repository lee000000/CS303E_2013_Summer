import java.util.*;

public class Exercise05_31 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter the initial deposit amount: ");
    double deposit = sc.nextDouble();
    
    System.out.print("Enter annual percentage yield: ");
    double yield = sc.nextDouble();
    
    System.out.print("Enter maturity period (number of month): ");
    int month = sc.nextInt();
    String temp = month + "";
    
    System.out.print("Month    CD Value");
    System.out.println("");
    
    TestFormat test1 = new TestFormat();

    double value = 0;
    for (int i = 1; i <= month; i++)
    {    
      value = deposit * Math.pow(1 + yield/1200, i);
      String str1 = test1.flushLeft(i + "%15.2f", value);
      
      System.out.println(str1);
    }
  }
}