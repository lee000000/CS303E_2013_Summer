import java.util.*;

public class Exercise05_49 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);

    System.out.print("Enter a string: ");
    String str = input.nextLine();
    str = str.toLowerCase();
    
    int countVow = 0;
    int countCons = 0;

    for (int i = 0; i < str.length(); i ++)
    { 
      if (str.charAt(i) <= 'z' && str.charAt(i)>= 'a')
      {
     
        if ((str.charAt(i) == 'a')|| (str.charAt(i) == 'e')||(str.charAt(i) == 'i')||(str.charAt(i) == 'o')||(str.charAt(i) == 'u'))
        {
      	  countVow ++;
        }
        else
        {
      	  countCons ++;
      	  System.out.println(str.charAt(i));
        } 
      }
      
    }
    System.out.println(str.charAt(0));
    System.out.println("The number of vowels is "+ countVow);
    System.out.println("The number of consonant is " + countCons);
  }
}