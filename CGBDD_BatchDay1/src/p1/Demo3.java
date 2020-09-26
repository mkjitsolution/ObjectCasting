package p1;

public class Demo3 {

	public static void main(String[] args) {
		
		Demo3 d3 = new Demo3();
		d3.doThings(1,5,88);
		System.out.println("------");
		d3.doThings(235,188);
		System.out.println("------");
		d3.doThings(1235,2188,78777,41000,8955,1450);
		System.out.println("------");
		d3.doThings();
		
	}
	// 
	public void doThings(int... abc)// 0 arg or 100
	{
		for (int i : abc) {
			System.out.println(i);
		}
	}
	// Rule : var agr should be the last argument
	public void doAnotherThings(int... abc)// 0 arg or 100
	{
		for (int i : abc) {
			System.out.println(i);
		}
	}
	
	
}
