package practice;
import java.util.Scanner;

class JavaPracticeClass {
	public static void main(String[] args) {
	    JavaSubClass bicycle1 = new JavaSubClass("ビアンキ", "緑");
	    System.out.println("【自転車の情報】");
	    bicycle1.printData();
	    System.out.println("-----------------");
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("走る距離を入力してください：");
	    int distance = scanner.nextInt();
	    bicycle1.run(distance);
	  }
}
