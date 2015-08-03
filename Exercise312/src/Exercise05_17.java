import java.util.*;

public class Exercise05_17 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);

    //Get input from user
    System.out.print("Enter the number of lines: ");
    int num = sc.nextInt();

    while (num > 15 || num < 1)
    {
      System.out.print("Enter the number of lines: ");
      num = sc.nextInt();
    }
    
    
    //Display the graph
    for (int i = 1; i <= num ; i++ )
    {
      printSpace(num - i);
   	  printLine(i);
   	  System.out.println("");
    }
  }
  
  public static void printSpace(int num)
  {
	  int k = 0;
	  int m = num *2;
	  while( k <= m)
	  {
		  System.out.print(" ");
		  k ++;
	  }
  }
  
  public static void printLine(int i)
  {
	  for (int k = i; k >= 1; k-- )
	  {
		  System.out.print(k + " ");
	  }
	  for (int l = 2; l <= i; l++)
	  {
		  System.out.print(l + " ");
	  }
  }

}