import java.io.*;

class AnotherException{
public static void main (String args []){


	//System.out.println(args [1]);	// put comment symbol when  java.lang.ArrayIndexOutOfBoundsException: 1 exist
	//System.out.println(args [0]);
try {
	FileInputStream f = new FileInputStream("input.txt");	// error: unreported exception FileNotFoundException - must be caught or declared to be thrown
	f.read();						// error: unreported exception IOException - must be caught or declared to be thrown
}
catch (FileNotFoundException fe)				// Exception Handling for FileNotFoundException
{
	System.out.println(fe);
}
catch (IOException ie)				// Exception Handling for IOException
{
	System.out.println(ie);
}
}
}