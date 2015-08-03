import java.util.*;

public class Exercise03_11 {
  public static void main(String[] args)
  {
    //Create Scanner object
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter date and year
    System.out.print("Enter month: ");
    int monthNum = input.nextInt();
    System.out.print("Enter year: ");
    int year = input.nextInt();

    //Change input number into month
    String month = "";
    switch (monthNum)
      {
        case 1: month = "January"; break;
        case 2: month = "Feburary"; break;
        case 3: month = "March"; break;
        case 4: month = "April"; break;
        case 5: month = "May"; break;
        case 6: month = "June"; break;
        case 7: month = "July"; break;
        case 8: month = "August"; break;
        case 9: month = "September"; break;
        case 10: month = "October"; break;
        case 11: month = "November"; break;
        case 12: month = "December"; break;
      }
    
    int monthDay = 0;
    
    //Display the result
    if ((year % 100 == 0 && year % 100 == 0) || ( year % 4 == 0))
    {
      if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12)
      {
        monthDay = 31;
      } else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11)
      {
        monthDay = 30;
      } else if (monthNum == 2)
      {
        monthDay = 29;
      }
    } else
    {
      if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12)
      {
        monthDay = 31;
      } else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11)
      {
        monthDay = 30;
      } else if (monthNum == 2)
      {
        monthDay = 28;
      }
    }

    System.out.println( month + " " + year + " had " + monthDay + " days.");  
  }

}
