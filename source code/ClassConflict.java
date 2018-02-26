import java.util.*; 	// compiler will only give Date class
import java.sql.*;		// * = wildcard

class ClassConflict {

	public static void main(String args[]) {
	java.sql.Date today = new java.sql.Date();
	System.out.println("Today is: " + today);
}
}