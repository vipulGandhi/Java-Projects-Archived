package UserDefinedException;

public class RegisterStudents
{

	public static void main(String[] args) throws ClassPassException
	{
		boolean isPassedInPreviousClass = false;
		int age = 50;
		
		if(age > 25)
		{
			try
			{
				throw new AgeDoesnotMatchException("Age is greater than 25, Admission can't be given");
			}
			catch(AgeDoesnotMatchException e)
			{
			    System.out.println(e) ;
			}		 
		}
		
		if(!isPassedInPreviousClass)
		{
			throw new ClassPassException();
		}
	}
}
