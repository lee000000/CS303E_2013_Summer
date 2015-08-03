
import java.util.*;

public class Exercise03_05 {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter today's day: ");
	  int dayNum = input.nextInt();

	  
	  System.out.print("Enter the number of days elapsed since today: ");
	  int pastDay = input.nextInt();
	  
	  int future = dayNum + pastDay;
	  
	  String futureDay = "";
	  
	  switch (future % 7)
	  {
	  case 0: futureDay = "Sunday"; break;	  
	  case 1: futureDay = "Monday"; break;
	  case 2: futureDay = "Tuesday"; break;
	  case 3: futureDay = "Wednesday"; break;
	  case 4: futureDay = "Thursday"; break;
	  case 5: futureDay = "Friday"; break;
	  case 6: futureDay = "Saturday"; break;
	  }
	  

	  if (dayNum == 0)
	  {
		  System.out.println("Today is Sunday and the future day is " + futureDay);
	  }
	  else if (dayNum == 1)
	  {
		  System.out.println("Today is Monday and the future day is " + futureDay);
	  }
	  else if (dayNum == 2)
	  {
		  System.out.println("Today is Tuesday and the future day is " + futureDay);
	  }
	  else if (dayNum == 3)
	  {
		  System.out.println("Today is Wednesday and the future day is " + futureDay);
	  }
	  else if (dayNum == 4)
	  {
		  System.out.println("Today is Thursday and the future day is " + futureDay);
	  }
	  else if (dayNum == 5)
	  {
		  System.out.println("Today is Friday and the future day is " + futureDay);
	  }
	  else if (dayNum == 6)
	  {
		  System.out.println("Today is Saturday and the future day is " + futureDay);
	  }
	}
}
