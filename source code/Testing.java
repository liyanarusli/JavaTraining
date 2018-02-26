class Testing{

	Testing(int x, int y){
	System.out.println("x : " + x + "y : " + y);
}
	Testing(String name, int marks){
	System.out.println("Name : " + name + " Marks : " + marks);
}

public static void main (String x []){

	//create object dulu utk panggil Constructor. Tak boleh simply call Constructor aka Testing sahaja.
	Testing t1 = new Testing(7,5);
	Testing t2 = new Testing("Liyana",200);
	
}
}