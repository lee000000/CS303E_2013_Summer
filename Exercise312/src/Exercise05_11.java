public class Exercise05_11 {
  public static void main(String[] args)
  { 
	int num = 100;
	int count = 0;
	for (;;)
	{   
		
		if (num >= 200)
		{
			break;
		}
		else if ((num % 5 == 0 || num % 6 == 0) && num % 30 != 0)
		{
			System.out.print(num + " ");
  		    num ++;
  		    count ++;
  		    if (count == 10)
  		    {
  		    	System.out.println("");
  		    	count = 0;
  		    }
		} 
		else
		{
			num ++;
			continue;
		}
    	      
	}	  
 
  }

}