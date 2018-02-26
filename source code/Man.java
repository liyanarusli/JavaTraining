
class Man {				// Man as a nameclass

	private String name;

	Man(String name) {		//this is constructor
		this.name = name;
	}

	
	public String getName() {		// getName use to retrieve name

		return name;
	}

	public void setName(String val) {	//setName use to set name

		name = val;		
	}	

	public static void swap(Man m1, Man m2) {	// using swap method
	System.out.println("Inside swap");

	System.out.println("m1 : " + m1);		// will print memory addres of m1
	System.out.println("m2 : " + m2);		// will print memory addres of m2

	System.out.println();
       	Man temp = m1;			// create temporary variable n value m1 into temp

        	m1 = m2;				// value m2 interchange into m1

	m2 = temp;			// value m2 interchange into temp

	System.out.println("m1 : " + m1);	
	System.out.println("m2 : " + m2);
	}

// Method to actually change the state of an object not its properties

	public static void changeState(Man m) {	

	m.setName("Gopinathan Munappy");

	}

	public static void main(String args[]) {
	
	Man m1  = new Man("Gopi");
	
	Man m2  = new Man("Gopinathan");

	System.out.println("m1 : " + m1);
	System.out.println("m2 : " + m2);

	System.out.println(m1.getName() + ": " + m2.getName());

// Called swap method n passing it to

	swap(m1, m2);		

	System.out.println("After the swap");
	System.out.println("m1 : " + m1);
	System.out.println("m2 : " + m2);
	System.out.println("");

	System.out.println(m1.getName() + ": " + m2.getName());

// 
	changeState(m1);
	changeState(m2);

	System.out.println(m1.getName() + ": " + m2.getName());

	} // main

} // class
	



