package p4;



public class InheritanceDemo {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.doEat(); // Dog specific doEat
	    Cat c = new Cat();
	    c.doEat();// output comes from Animal class
	}
}
