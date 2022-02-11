public class Bulldogs extends Dogs{
	public int snoutSize;
	public Bulldogs(String name, int yob, int snoutSize){//constructor that sets instance variables 
		super(name, yob);
		this.snoutSize = snoutSize;
	}
	public String toString(){ //converts variables to string so they can print 
		return (name + " the Bulldog, born in " + yob + ", has a " + snoutSize + " inch snout");
		
	}






}
