import java.util.*;


public class Exercise05_09 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the number of students: ");
    int num = input.nextInt();
    
   
    String name[] =new String[num];
    double score[] =new double[num];
    
    for (int i = 0; i < num; i ++)
    {
      System.out.print("Enter the name and score: ");
      name[i] = input.next();
      score[i] = input.nextDouble();
    }
    
    double firstScore = score[0];
    String firstName = "";
    for (int j = 0; j < score.length - 1; j ++)
    {
    	if (score[j] <= score [j+1])
    	{
    		firstScore = score [j + 1];
    		firstName = name[j + 1];
    	}
    	else
    	{
    		firstScore = score[j];
    		firstName = name [j];
    	}
    }
    
    double secondScore = score[0];
    String secondName = "";
    
    if (secondScore < firstScore)
    {
    	for (int k = 0; k < score.length - 1; k ++) 	
        {   	
        	if (score[k] <= score [k+1])
        	{
        		secondScore = score [k + 1];
        		secondName = name[k+ 1];
        	}
        	else
        	{
        		secondScore = score[k];
        		secondName = name [k];
        	}
        }
    }
    else
    {
    	s
    }
   
    System.out.println(firstName + " "+ firstScore);
    System.out.println(secondName + " "+ secondScore);
  }
}
