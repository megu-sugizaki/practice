package practice;

class JavaPracticeClass {
	public static void main(String[] args) {
	    JavaFifthClass person1 = new JavaFifthClass("Kate", "Jones", 27, 1.6, 50.0);
	    JavaFifthClass person2 = new JavaFifthClass("John", "Christopher", "Smith", 65, 1.75, 80.0);

	    JavaThirdClass car = new JavaThirdClass("フェラーリ", "赤");
	    JavaSubClass bicycle = new JavaSubClass("ビアンキ", "緑");
	    
	    // buyメソッドを用いて、person1にcarを購入させてください
	    person1.buy(car);
	    
	    // buyメソッドを用いて、person2にbicycleを購入させてください
	    person2.buy(bicycle);

	    System.out.println("【車の情報】");
	    car.printData();
	    System.out.println("-----------------");
	    System.out.println("【車の所有者の情報】");
	    car.getOwner().printData();

	    System.out.println("=================");
	    System.out.println("【自転車の情報】");
	    bicycle.printData();
	    System.out.println("-----------------");
	    System.out.println("【自転車の所有者の情報】");
	    bicycle.getOwner().printData();
	  }
}
