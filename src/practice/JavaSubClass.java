package practice;

class JavaSubClass {
	public static int count = 0;
	  public String firstName;
	  // インスタンスフィールドmiddleNameを定義してください
	  public String middleName;
	  
	  public String lastName;
	  public int age;
	  public double height, weight;

	  JavaSubClass(String firstName, String lastName, int age, double height, double weight) {
	    JavaSubClass.count++;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	  }
	  
	  // middleNameを受け取るコンストラクタを定義してください
	  JavaSubClass(String firstName, String middleName, String lastName, int age, double height, double weight) {
	    JavaSubClass.count++;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.middleName = middleName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	  }

	  public String fullName() {
	    return this.firstName + " " + this.lastName;
	  }

	  public void printData() {
	    System.out.println("私の名前は" + this.fullName() + "です");
	    System.out.println("年齢は" + this.age + "歳です");
	    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	  }

	  public double bmi() {
	    return this.weight / this.height / this.height;
	  }

	  public static void printCount() {
	    System.out.println("合計" + JavaSubClass.count + "人です");
	  }
	  
	}
