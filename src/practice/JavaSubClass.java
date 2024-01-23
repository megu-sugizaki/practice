package practice;

class JavaSubClass {
	  private String name;
	  
	  JavaSubClass(String name){
	   this.name = name;
	  }
	 
	  public String getName(){
	   return this.name;
	  }
	 
	  // public void setName(String name){
	  // this.name = name;
	  // }
	  
	  public void printData(){
	    System.out.println("名前：" + this.name);
	  }
	}
