//Import the utility package from java library
import java.util.*;

public class Day
{
  public static void main (String[] args)
  {
    //Create Scanner object
    Scanner input = new Scanner(System.in);

    //Create variable year for year entered and check condition
    System.out.print("Enter year: ");
    int year = input.nextInt(); 
    while (year < 1900 || year > 2100)
    {
     System.out.print("Enter year: ");
     year = input.nextInt();
      
    }

    //Create variable mon for month entered and check condition
    System.out.print("Enter month: ");
    int mon = input.nextInt();
    while (mon > 12 || mon < 1)
    {
      System.out.print("Enter month: "); 
      mon = input.nextInt();
    }

    //Create variable dayNum for day entered and check condition
    System.out.print("Enter day: ");
    int dayNum = input.nextInt();
    while (dayNum < 1 && dayNum > 31)
    {
      System.out.print("Enter day: ");
      dayNum = input.nextInt();
    }

    //If the month is February
    if (mon == 2)
    {
      
      //If the year is a leap year
      if ((year / 100 == 0 && year / 400 == 0) || year / 4 == 0)
      {
        while (dayNum > 28 )
        {
          System.out.print("Enter day: ");
          dayNum = input.nextInt();
        }
      }
      
      // If the year is not a leap year
      else
      {
        while (dayNum > 29 )
          {
            System.out.print("Enter day: ");
            dayNum = input.nextInt();
          }
      }
    }
    
    //If the month is 1, 3, 5, 7, 8, 10, 12
    else if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon 

== 12)
    {
      while (dayNum > 31 )
      {
        System.out.print("Enter day: ");
        dayNum = input.nextInt();
      }
    }
    
    //If the month is 4, 6, 9, 11
    else if (mon == 4 || mon == 6 || mon == 9 || mon == 11)
      {
        while (dayNum > 30)
        {
          System.out.print("Enter day: ");
          dayNum = input.nextInt();
        }
      }

    //Declare a new variable for month
    int newMon;
    if (mon >= 3)
    {
      newMon = mon - 2;
    }
    else
    {
      newMon = mon + 10; 
    }

    //Declare century
    int century = year / 100;


    //Compute the day using Rev. Zeller's method
    String day = ComputeDay(newMon, dayNum, year, century);

    //Display resutl
    System.out.println("That day was " + day);
  }
  
   public static String ComputeDay(int a, int b, int c, int d)
  {
	String str = null;
    int w = (13 * a - 1) / 5;
    int x = c / 4;
    int y = d / 4;
    int z = w + x + y + b + c - 2 * d;
    int r = z % 7;
    r = (r + 7 ) % 7;
    System.out.print(r);
    switch (r)
    {
      case 0: str = "Sunday"; break;
      case 1: str =  "Monday"; break;
      case 2: str =  "Tuesday"; break;
      case 3: str =  "Wednesday"; break;
      case 4: str =  "Thursday"; break;
      case 5: str =  "Friday"; break;
      case 6: str =  "Saturday"; break;
    }
    return str;
  }
}