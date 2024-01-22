package practice;

class JavaPracticeClass {
	public static void main(String[] args) {
	    JavaSubClass person1 = new JavaSubClass("Kate", "Jones", 27, 1.6, 50.0);

	    System.out.println(person1.fullName());
	    System.out.println(person1.age);
	    System.out.println(person1.bmi());
	  }
}
