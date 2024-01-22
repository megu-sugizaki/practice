package practice;

class JavaPracticeClass {
	public static void main(String[] args) {
	    JavaSubClass person1 = new JavaSubClass();
	    person1.hello();
	    
	    // person1のインスタンスフィールドnameに「Kate Jones」をセットしてください
	    person1.name = "Kate Jones";
	    
	    // person1のインスタンスフィールドnameの値を出力してください
	    System.out.println(person1.name);

	    JavaSubClass person2 = new JavaSubClass();
	    person2.hello();
	    
	    // person2のインスタンスフィールドnameに「John Christopher Smith」をセットしてください
	    person2.name = "John Christopher Smith";
	    
	    // person2のインスタンスフィールドnameの値を出力してください
	    System.out.println(person2.name);
	    
	  }
}
