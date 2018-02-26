
import java.util.Scanner;

class UserInputSum {
   public static void main(String[] args) {
      
      Double number, sum = 0.0;
      Scanner input = new Scanner(System.in);
      
      while (true) {
         System.out.print("Enter a number: ");
        number = input.nextDouble();	// nextDouble scans the next token of the input as a double
         
         if (number < 0.0) {		// kalau input number less than 0.0 it will break
            break;
         }
         
         sum += number;
      }
      System.out.println("Sum = " + sum);
   }
}
