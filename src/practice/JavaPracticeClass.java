package practice;

class JavaPracticeClass {
	public static void main(String[] args) {
	    JavaSubClass person1 = new JavaSubClass("Kate", "Jones", 27, 1.6, 50.0);
	    person1.printData();
	    
	    // middleNameとして「Christopher」を渡してください
	    JavaSubClass person2 = new JavaSubClass("John", "Christopher", "Smith", 65, 1.75, 80.0);
	    person2.printData();
	    
	    JavaSubClass.printCount();
	  }
}
