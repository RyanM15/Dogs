public class Dogs{
	public String name;
	public int yob;
	
	
	public Dogs(String name, int yob){//constructor that sets instance variables 
		this.name = name;
		this.yob = yob;
	}
	
	public String toString(){//converts variables to string so they can print 
		return (name + " was born in " + yob);
	}
		
	
	public void eat(){
		System.out.println(name + "is eating");
		
	}
	public void bark(){
		System.out.println("Woof Woof");
	}
	
	public void sleep(){
		System.out.println("Zzzzzzzz");
	}


}
