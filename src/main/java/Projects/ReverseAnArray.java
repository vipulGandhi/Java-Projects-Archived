package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray
{
	public static void main(String[] args)
	{
		List<Integer> sampleList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		List<Integer> reversedSampleList = new ArrayList<>();
		
		for (int i = sampleList.size() - 1; i >= 0; i--)
		{
			reversedSampleList.add(sampleList.get(i));
		}
		
		System.out.println(reversedSampleList);
	}
}
