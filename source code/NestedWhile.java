class NestedWhile{
public static void main (String args []){
	int outer = 1;
	while (outer < 3){
	
	int inner = 4;
	while(inner < 9){
	
	System.out.println (outer + " " + inner);
	inner++;
}
	outer++;
}
}

}