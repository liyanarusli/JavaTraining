// Program to find the sum of natural numbers from 1 to 1000.

class SummingUpNumbers {
   public static void main(String[] args) {
      
      int sum = 0;
	   
      for (int i = 2; i <= 5; i++) {
         sum += i;     		// sum = sum + i (i akan increment 1 dulu baru buat operation)
System.out.println("Intermediate Sum =  "  + sum + System.lineSeparator() );     
 
}  
      System.out.println("Final Sum = " + sum);	// print accumulative value
   }
}