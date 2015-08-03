import java.util.*;

public class Exercise06_21 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Enter a String: ");

    String str = sc.nextLine(); 
    str = str.toLowerCase();
    StringBuffer strb = new StringBuffer (str);

    for (int i = 0; i < str.length(); i++)
    {
      if (str.charAt(i)<= 'z' && str.charAt(i) >= 'a')
      {
        switch (str.charAt(i))
        {
          case 'a':
          case 'b':
          case 'c': strb.replace(i,i+1,"2");break;
          case 'd':
          case 'e':
          case 'f': strb.replace(i,i+1,"3");break;
          case 'g':
          case 'h':
          case 'i': strb.replace(i,i+1,"4");break;
          case 'j':
          case 'k':
          case 'l': strb.replace(i,i+1,"5");break;
          case 'm':
          case 'n':
          case 'o': strb.replace(i,i+1,"6");break;
          case 'p':
          case 'q':
          case 'r': 
          case 's': strb.replace(i,i+1,"7");break;
          case 't':
          case 'u': 
          case 'v': strb.replace(i,i+1,"8");break;
          case 'w':
          case 'x':
          case 'y':
          case 'z': strb.replace(i,i+1,"9");break;
         }
      }
      else if (str.substring(i,i+1).equals(" "))
      {
          strb.replace(i,i+1,"0");
      }
    }
    str = strb.toString();
    System.out.println(str);
  }
}