import java.util.*;


public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String 1: ");
		String str1 = sc.next();
		str1 = str1.toLowerCase();
		
		System.out.println("Enter String 2: ");
		String str2 = sc.next();
		str2 = str2.toLowerCase();
		
		boolean isAnagram = false;
	
		if (str1.length() == str2.length())
		{
			for (int i = 0; i < str2.length(); i ++)
			{
				if (str1.indexOf(str2.substring(i, i+1)) != -1)
				{
					isAnagram = true;
				}
			}
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		
		if (isAnagram == true)
		{
			System.out.println("Is Anagram");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	}
}
