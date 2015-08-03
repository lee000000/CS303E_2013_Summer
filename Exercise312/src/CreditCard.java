import java.util.*;

public class CreditCard
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter 15 or 16-digit credit card number: ");
    long cardNum = sc.nextLong();
    System.out.println();

    String temp = "" + cardNum;
    int length = temp.length();

    //Check if the input is a 15 or 16 digit number
    if ( temp.length() != 15 && temp.length() != 16)
    {
      System.out.println("Not a 15 or 16-digit number");
      return;
    }

    //Check the validity of the credit card number
    boolean is_valid = is_valid(cardNum, length);

    if (is_valid == false)
    {
      System.out.println("Invalid credit card number");
      return;
    }
    else
    {
      String type = cardType (cardNum);
      System.out.println("Valid " + type +" credit card number");
    }

  }

  // This method checks if a credit card number is valid
  public static boolean is_valid (long cardNum,int length) 
  { 
    long sum = computeSum (cardNum, length);
    
    boolean is_valid;
    if (sum % 10 == 0)
    {
      is_valid = true;
    }    
    else
    {
      is_valid = false;
    }
    return is_valid;
  }


  //Compute the sum of digits using the Luhn's method
  public static long computeSum (long cardNum, int length)
  {
    long sum = 0;

    if (length == 15)
    {
      cardNum = cardNum * 10;
    }

    for (int i = 0; i < 16; i ++)
    {
      long even = cardNum % 10;
      cardNum = cardNum / 10;
      long odd = 2 * (cardNum % 10);

      if ( odd >= 10)
      {
        odd = sumOdd(odd);
      }
  
      sum = sum + odd + even;
      cardNum = cardNum / 10;
    }
    return sum;
    
  }


  //Compute the sum of the digits
  public static long sumOdd(long num)
  { 
    long sumDigit = 0;
    while (num > 0)
    {
      sumDigit = sumDigit + (num % 10);
      num = num / 10;
    }
    return sumDigit;
  }

  // This method returns the type of credit card
  public static String cardType (long cardNum)
  {
    String str = "" + cardNum;
    String type = "";
    switch (str.substring(0,2))
    {
      case "34":
      case "37": type = "American Express"; break;
      case "50":
      case "51":
      case "52":
      case "53":
      case "54":
      case "55": type = "MasterCard"; break;
      case "65": type = "Discover"; break;
    }
    
    if (str.substring (0 ,1).equals("4"))
    {
      type = "Visa";
    }
    
    else if (str.substring(0,3).equals("644") || str.substring(0,4).equals("6011"))
    {
      type = "Discover";
    }
    return type;
  }
}