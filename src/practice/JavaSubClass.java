package practice;

class JavaSubClass {
	public String name;

	  // コンストラクタがString型の引数を受け取るようにしてください
	  JavaSubClass(String name) {
	    System.out.println("インスタンスが生成されました");
	    // インスタンスフィールドnameに値をセットしてください
	    this.name = name;
	    
	  }

	  public void hello() {
	    System.out.println("こんにちは、私は" + this.name + "です");
	  }
	  
	}
