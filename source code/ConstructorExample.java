public class ConstructorExample {

	int age;
	String name; 

ConstructorExample() {		// default contructor by JVM
	this.name = " Aishah ";
	this.age = 100;
}


ConstructorExample( String n, int a){	// parameterized contructor
	this.name = n;
	this.age = a;
}

public static void  main (String args [] ){

	ConstructorExample obj1 = new ConstructorExample();
	ConstructorExample obj2 = new ConstructorExample(" Lutfi ",56);

	System.out.println (obj1.name + " " + obj1.age);
	System.out.println (obj2.name + " " + obj2.age);
}
}
