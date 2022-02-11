import java.util.ArrayList;
public class DogsTest{
	
	public static void main(String[] args){ //tester file that sets the variables 
		
		//sets variables for Dogs class
		Dogs d1 = new Dogs("Buster", 2006);
		Dogs d2 = new Dogs("Daniel", 2008);	
		
		//sets variables for Doodles class
		Doodles do1 = new Doodles("Buddy", 2019, "does not shed");
		Doodles do2 = new Doodles("Lucky", 2015, "does not shed");
		
		//sets variables for Bulldogs class
		Bulldogs b1 = new Bulldogs("Joey", 2011, 2);
		Bulldogs b2 = new Bulldogs("Rocco", 2007, 1);
		
		ArrayList<Dogs> dogs = new ArrayList<Dogs>();
		//adds all the dogs to the arraylist (have to do this first to populate array)
		dogs.add(d1);
		dogs.add(d2);
		dogs.add(do1);
		dogs.add(do2);
		dogs.add(b1);
		dogs.add(b2);
		
		System.out.println("Dogs before the move: ");
		System.out.println("/////////////////////");
		for(int i = 0; i < dogs.size(); i++){ //prints out ArrayList
			System.out.println(dogs.get(i).toString());
		}
		System.out.println("\n\n\n\n");
		
		
		//uses set method to switch the dogs around
		dogs.set(0, b1);
		dogs.set(1, d2);
		dogs.set(2, do2);
		dogs.set(3, b2);
		dogs.set(4, d1);
		dogs.set(5, do1);
		System.out.println("Dogs after the move: ");
		System.out.println("/////////////////////");
		for(int i = 0; i < dogs.size(); i++){ //prints out ArrayList
			System.out.println(dogs.get(i).toString());
		}
		
		
		
	
		
		
	}
		





}
