// Nested if...else Statement mean that there is 
class NestedIfElse {
    public static void main(String[] args) {

        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, smallesttNumber;

if (n1 <= n2) {
if (n1 <= n3) {
                smallesttNumber = n1;
} 
else 
	{
                smallesttNumber = n3;
           	 }
} 
else 	
	{            
	if (n2 >= n3) {
                smallesttNumber = n2;
            } else {
                smallesttNumber = n3;
            }
        }

        System.out.println("Smallest number is " + smallesttNumber);
    }		// main
}		// class