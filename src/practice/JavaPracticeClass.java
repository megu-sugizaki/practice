package practice;

class JavaPracticeClass {
	public static void main(String[] args) {
	    // 仕事を「医者」にしてください
	    JavaSubClass person1 = new JavaSubClass("Kate", "Jones", 27, 1.6, 50.0, "医者");
	    person1.printData();
	    // 仕事を「教師」にしてください
	    JavaSubClass person2 = new JavaSubClass("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
	    person2.printData();
	    System.out.println("----------------------");
	    // person1の仕事を「獣医」に変更してください
	    person1.setJob("獣医");
	    
	    // 「person1の仕事を◯◯に変更しました」と出力されるようにしてください
	    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
	    
	    person1.printData();
	  }
}
