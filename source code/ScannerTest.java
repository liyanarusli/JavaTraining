import java.util.Scanner;

public class ScannerTest{
public static void main (String arg[] ){

Scanner scanner = new Scanner (System.in);
String name = "";

System.out.print("Your name, adventurer? > ");
name = scanner.next();
System.out.println();

System.out.println("Welcome, " + name + " to Javaland!");
}
}