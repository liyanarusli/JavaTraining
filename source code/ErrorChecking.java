package errorhandling;
public class ErrorChecking{
public static void main (String args [] ){

try
	{
		int x = 10;
		int y = 0;
		int z = x/y;
	
	System.out.println( z );
	}

catch (Exception err)	//parent class of ArithmeticException
	{
	System.out.println(err.getMessage());
	
	}

}
}