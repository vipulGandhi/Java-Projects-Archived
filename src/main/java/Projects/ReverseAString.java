package Projects;

import java.util.Iterator;

public class ReverseAString
{
	public static void main(String[] args)
	{
		String nameString = "MyName";
		
		String reverseNameString = "";
		
		for (int i = 0; i < nameString.length(); i++)
		{
			reverseNameString = nameString.charAt(i) + reverseNameString;
		}
		System.out.println(reverseNameString);
	}
}
