package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class JavaCollectionsBasics
{
	@Test
	public void initializeSet()
	{
		Set<Integer> sampleSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(sampleSet);
	}
	
	@Test
	public void initializeList()
	{
		List<Integer> sampleList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(sampleList);
	}
}
