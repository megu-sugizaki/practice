package practice;

class JavaSubClass {
	public String name;

	  // コンストラクタを定義してください
	  JavaSubClass(){
	    System.out.println("インスタンスが生成されました");
	  }

	  public void hello() {
	    System.out.println("こんにちは、私は" + this.name + "です");
	  }
	  
	}
