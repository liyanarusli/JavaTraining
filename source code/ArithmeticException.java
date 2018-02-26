class ArithmeticException {
public static void main (String args []){

	int x = 10;
	int y = 0;		// will cause ArithmeticException: / by zero
	int z = 0;
	
// to avoid ArithmeticException: / by zero put in try and catch block to erase your suspicious

try
	{
		z = x/y;	
	}

catch (ArithmeticException a) 
	{	
	System.out.println(" You are dividing by zero   :   this is error :   " + a);
	}


}
}


/* contoh code yg akan beri error pada ArithmeticException

class X {
public static void main (String args []){

	int x = 10;
	int y = 0;	
	int z = 0;

	z = x/y;	
	System.out.println("Value of z : " + z)
}
}
*/