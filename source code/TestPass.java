class TestPass{

	public static void main (String args []){
	Person temp = p1;
	p1 = p2;
	p2 = temp;
}
	public static void main (String args[]){
	Person person1 = new Person("John");
	Person person2 = new Person("Paul");
	System.out.println(person1.getName () + " : " + person2.getName());

	swap(person1, person2);
	System.out.println(person1.getName () + " : " + person2.getName());
}
}