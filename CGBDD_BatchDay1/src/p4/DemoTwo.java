package p4;

public class DemoTwo {

	public static void main(String[] args) {
		DemoTwo obj = new DemoTwo();
		                // down-casting
		Animal a = new Dog(); // correct
		// Dog d = new Animal(); //error
		
		obj.doThings(a);
		Animal a2 = new Cat();
		obj.doThings(a2);
		
	}
	
	public void doThings(Animal a)
	{
		a.doEat();
		if(a instanceof Dog)
		{
			Dog d = (Dog)a; // up-casting
			d.playGames();
		}
		if(a instanceof Cat)
		{
			Cat c = (Cat)a; // up-casting
			c.doHunt();
		}
		
		
	}
}
