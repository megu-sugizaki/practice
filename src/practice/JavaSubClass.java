package practice;

class JavaSubClass {
	 // インスタンスフィールド
	  private String name;
	  private String color;
	  private int distance;
	  
	  // コンストラクション
	  JavaSubClass(String name, String color, int distance){
	   this.name = name;
	   this.color = color;
	   this.distance = distance;
	  }
	 
	// publicでインスタンスフィールドを使用できるように
	  public int getDistance(){
	  return this.distance;
	  }
	 
	  public void setDistance(int distance){
	  this.distance = distance;
	  }
	  
	  // 最終的に出力したい情報群
	  public void printData(){
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離：" + this.distance + "km");
	  }
	}
