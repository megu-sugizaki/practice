package practice;

class JavaPracticeClass {
	public static void main(String[] args) {
	    JavaSubClass person1 = new JavaSubClass("Kate", "Jones", 27, 1.6, 50.0);
	    person1.printData();
	    JavaSubClass person2 = new JavaSubClass("John", "Christopher", "Smith", 65, 1.75, 80.0);
	    person2.printData();

	    System.out.println("----------------------");
	    // person2に対して、getMiddleNameメソッドを呼び出し、「person2のミドルネームは◯◯です」と出力してください
	    System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
	    
	  }
}
