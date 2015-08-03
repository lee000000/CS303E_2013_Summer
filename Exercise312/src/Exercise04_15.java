import java.util.*;

public class Exercise04_15 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter a letter: ");
    String str = input.nextLine();
    char ch = str.charAt(0);
    
    int num = 0;
    switch (ch)
    {
      case 'A':
      case 'a':
      case 'B':
      case 'b':
      case 'C':
      case 'c': num = 2; break;
      case 'D':
      case 'd':
      case 'E':
      case 'e':
      case 'F':
      case 'f': num = 3; break;
      case 'G':
      case 'g':
      case 'H':
      case 'h':
      case 'I':
      case 'i': num = 4; break;
      case 'J':
      case 'j':
      case 'K':
      case 'k':
      case 'L':
      case 'l': num = 5; break;
      case 'M':
      case 'm':
      case 'N':
      case 'n':
      case 'O':
      case 'o': num = 6; break;
      case 'P':
      case 'p':
      case 'Q':
      case 'q':
      case 'R':
      case 'r':
      case 'S':
      case 's': num = 7; break;
      case 'T':
      case 't':
      case 'U':
      case 'u':
      case 'V':
      case 'v': num = 8; break;
      case 'W':
      case 'w':
      case 'X':
      case 'x':
      case 'Y':
      case 'y':
      case 'Z':
      case 'z': num = 9; break;
    }
    
    //Display results
    if (Character.isLetter(ch) == false)
    {
      System.out.println(str + " is an invalid input"); 
    }
    else
    {
      System.out.println("The corresponding number is " + num);
    }
  }

}