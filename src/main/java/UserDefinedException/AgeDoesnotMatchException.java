package UserDefinedException;

public class AgeDoesnotMatchException extends Exception
{
	// This statement is to supress the warning. We can remove this statement
	private static final long serialVersionUID = -8046813932612699940L;

	public AgeDoesnotMatchException(String exceptionString)
	{
		super(exceptionString);
	}
}
