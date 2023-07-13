package UserDefinedException;

public class ClassPassException extends Exception
{
	// This statement is to supress the warning. We can remove this statement
	private static final long serialVersionUID = 6477784365791745264L;

	public ClassPassException()
	{
		super("Not passed in previous class, admission can't be given");
	}
}
