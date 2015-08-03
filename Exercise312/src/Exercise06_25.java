import java.util.*;

public class Exercise06_25 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a number: ");

    long num = sc.nextLong();
    String result = converMillis(num);
    System.out.println(result);
  }
  
  public static String converMillis(long mills)
  {
    long sec = mills / 1000;
    long min = mills / 60000;
    long hr = mills / 3600000;
    
    String result = hr +":" + min + ":" + sec;
    return result;
  }
}