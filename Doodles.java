public class Doodles extends Dogs{
	public String noShed;
	public Doodles(String name, int yob, String noShed){//constructor that sets instance variables 
		super(name, yob);
		this.noShed = noShed;
	}
	public String toString(){ //converts variables to string so they can print 
		return (name + " the Doodle, born in " + yob + ", " + noShed);
		
	}






}
