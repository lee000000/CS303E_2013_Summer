
public class Exercise05_35 {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <= 624; i++)
		{
			sum = sum + 1 / (i + Math.sqrt(i+1));
			
		}
		System.out.println(sum);

	}

}
