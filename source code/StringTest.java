class StringTest {
   public static void main(String[] args) {

	String str1 = new String ("Paul");
	String str2 = new String ("Paul");
	
/*	cara pertama = false sbb xboleh baca memory address yg sama
	System.out.print(str1);
	System.out.print(str2);
	System.out.print(str1 == str2);
*/

/* 	cara kedua = true		*/
	String str3 = "Harry";
	String str4 = "Harry";
	System.out.print(str3 == str4);
}

}