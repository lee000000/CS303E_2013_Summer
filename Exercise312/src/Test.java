import java.util.*;

public class Test {

	public static void main(String[] args) {
		/*
		String str1 = "ABCDEFGH";
		String str2 = "aBCDefgh";
		String str3 = "Hello World";
		
		// lexicographical comparison
		if (str1.compareTo(str2) > 0)
		{
			System.out.println("Greater " + str1.compareTo(str2));
		}
		else System.out.println("No Greater " + str1.compareTo(str2));

		//String equality
		if (str1.equals(str2))
		{
			System.out.println("Yes Equal");
		}
		else System.out.println("Not Equal");
		
		//Get substring
		System.out.println(str3.substring(2));
		System.out.println(str3.substring(1,4));
		
		//Search substring
		System.out.println(str3.indexOf("ell"));
		
		//Splitting strings
		String str4 = "This is a test";
		//split the string by "Space" and store in an array
		String[] result = str4.split("\\s");
		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
		
		//StringBuffer Class/Method
		
		//Construction
		StringBuffer strBuf1 = new StringBuffer();
		StringBuffer strBuf2 = new StringBuffer( 100 );
		StringBuffer strBuf3 = new StringBuffer ("Hello World");
		
		System.out.println(strBuf1.capacity());
		System.out.println(strBuf3.capacity());
		
		//This is incompatible
		/* String s = strBuf1;*/
		/*
		//insert
		strBuf3 = strBuf3.insert(6, "My");
		System.out.println(strBuf3);
		
		//Delete
		strBuf3.delete(6,8);
		System.out.println(strBuf3);
		
		//replace
		strBuf3.replace(0,  5, "Beautiful");
		System.out.println(strBuf3);
		
		//********String Builder Class********
		String str = "hello";
		
		//Construction
		StringBuilder stb = new StringBuilder(str);
		System.out.println(stb);
		
		//reverse
		stb.reverse();
		System.out.println(stb);
		
		//Check if a string is a palindrome or not
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str5 = sc.next();
		
		StringBuilder strReverse = new StringBuilder(str5);
		String str6 = strReverse.reverse().toString();
		
		if (str5.equals(str6))
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		*/	
		StringBuffer strBuff = new StringBuffer ("ab*cd");
		  
		  for (int i = 0 ; i <= strBuff.length() - 1; i ++)
		  {
		    if (strBuff.substring(i, i + 1) == "\\*")
		    {
		      strBuff = strBuff.delete(i-1, i + 2);
		    }
		  }
		  System.out.print( strBuff.toString());
		
	}

}
