package practice;
import java.util.Scanner;

class JavaPracticeClass {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    JavaThirdClass car = new JavaThirdClass("フェラーリ", "赤");
	    JavaSubClass bicycle = new JavaSubClass("ビアンキ", "緑");

	    System.out.println("【車の情報】");
	    car.printData();
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    int carDistance = scanner.nextInt();
	    // runメソッドを呼び出して、引数にcarDistanceを渡してください
	    car.run(carDistance);
	    
	    System.out.println("-----------------");
	    System.out.print("給油する量を入力してください：");
	    int litre = scanner.nextInt();
	    car.charge(litre);
	    
	    System.out.println("=================");
	    System.out.println("【自転車の情報】");
	    bicycle.printData();
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    int bicycleDistance = scanner.nextInt();
	    // runメソッドを呼び出して、引数にbicycleDistanceを渡してください
	    bicycle.run(bicycleDistance);
	    
	  }
}
