package practice;

class JavaSubClass {
	  // インスタンスフィールド
	  private String name;
	  private String color;
	  
	  // コンストラクション
	  JavaSubClass(String name, String color){
	   this.name = name;
	   this.color = color;
	  }
	 
	// publicでインスタンスフィールドを使用できるように
	  // public String getName(){
	  // return this.name;
	  // }
	 
	  // public void setName(String name){
	  // this.name = name;
	  // }
	  
	  // 最終的に出力したい情報群
	  public void printData(){
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	  }
	}
