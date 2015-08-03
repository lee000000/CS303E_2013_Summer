import java.util.Scanner;


/*Create class Exercise02_11*/
public class Exercise02_11
{
  //Constant initialPopulation
  private static int initialPopulation = 312032486;

  //Create main method main
  public static void main(String[] args)
  {
     //Create object input
    Scanner input = new Scanner(System.in);

    //Get input
    System.out.print("Enter the number of years: ");

    //Create variable year
    int year = input.nextInt();


    //Compute population for given year
    double  population = computePopulation(year);
    
    System.out.println(population);


    //Display result
    System.out.println("The population in year " + year + " is " + (int)population);

  }
  
  //Create method computePopulation
  public static double computePopulation(int year)
  {
    //Create variable population
     double population = initialPopulation;

     double birth = year * 365 * 24 * 60 * 60 / 7.0;
     double death = year * 365 * 24 * 60 * 60 / 13.0;
     double newImmigrant = year * 365 * 24 * 60 * 60 / 45.0;
     population = population + birth - death + newImmigrant;

    //return population
    return population;
  }
}
