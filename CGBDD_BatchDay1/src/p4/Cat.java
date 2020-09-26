package p4;

public class Cat extends Animal {
	public void doHunt()
	{
		System.out.println("Cat hunts rats");
	}

	@Override
	public void doEat() {
		System.out.println("cat drinks milk");
	}
	
	
}
