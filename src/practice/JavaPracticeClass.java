package practice;

class JavaPracticeClass {
	public static void main(String[] args) {
	    JavaSubClass person1 = new JavaSubClass("Kate", "Jones", 27, 1.6, 50.0);
	    person1.printData();
	    
	    JavaSubClass person2 = new JavaSubClass("John", "Smith", 65, 1.75, 80.0);
	    person2.printData();
	    
	    // 「合計◯◯人です」と出力してください
	    System.out.println("合計" + JavaSubClass.count + "人です");
	    
	  }
}
