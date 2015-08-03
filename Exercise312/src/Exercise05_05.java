public class Exercise05_05 {
  public static void main(String[] args)
  {
    System.out.println("Kilograms       Pounds    |    Pounds     Kilograms");
    int kiloCon;
    double poundVar;
    int poundCon;
    double kiloVar;
    
    for (int i = 1; i <= 100; i ++)
    {
    	kiloCon = i * 2 - 1;
    	poundVar = kiloCon * 2.2;
    	poundCon = 5 * (i + 3);
    	kiloVar = poundCon / 2.2;
    	System.out.printf("%2d %19.1f %4s %5d %17.2f", kiloCon, poundVar, "|",  poundCon, kiloVar );
        System.out.println("");
    	
    }
  }

}