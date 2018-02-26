class TestingStatic{
	int x = 10;		//this is non-static variable
	static int y = 20;		//this is static variable

	void doIt(){		//this is non-static method
	System.out.println(" Hi! ");
}

	static void dontDo(){		//this has a static method
	System.out.println(" Bye! ");
}

	public static void main(String x []){
	System.out.println("x :" + x);	
	TestingStatic t1 = new TestingStatic();
	t1.doIt();
	//doIt;		// this line (l17) will not compile because it called non-static method
	dontDo();		// this line (l18) will compile because it called static method
}
}