// Equilibrium index of an array
	// The equilibrium index of an array is an index such that
		// The sum of elements at lower indexes is equal to the sum of elements at higher indexes

// Example
	/*
		Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
		3 is an equilibrium index, because: 
		A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
		
		
		Input: A[] = {1, 2, 3} 
	    No equilibrium index	
	 */

// Solution idea
	// Before starting the ith iteration of loop, suppose we know totalSum and value of leftSum. Then at ith iteration:
		// We can easily update rightSum which is equal to totalSum - leftSum- A[i]
		// Now we check if leftSum and rightSum are equal or not. If yes, we return index i as an output.
		// Otherwise, we move to the next iteration.
		// Before moving to the next iteration, we update leftSum for next iteration i.e. leftSum = leftSum + A[i]


package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquillibriumIndex
{
	public static void main(String[] args)
	{
		
		List<Integer> sampleArrayList = new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
		
		int totalSum = 0;
		int leftSum = 0;
		
		for (int i = 0; i < sampleArrayList.size(); i++)
		{
			int rightSum = totalSum - leftSum - sampleArrayList.get(i);
			
			if(leftSum == rightSum)
			{
				System.out.println("Equillibrium index is : " + i);
			}
			
			leftSum = leftSum + sampleArrayList.get(i);
		}
	}
}
