package p1;

import static p2.MyBankClass.bankName;
import static java.lang.System.out;
import static java.lang.System.err;
import static p2.MyBankClass.bankWork;


public class Demo1 {

	int x ; // scope of x, Access Modifier of x
	static int y = 99;
	static
	{
		System.out.println(" 1");
	}
	public static void main(String[] args) {
		
		// x = 100; error cannot access directly , only through object
		
		Demo1 obj1 = new Demo1();
		Demo1 obj2 = new Demo1();
		Demo1 obj3 = new Demo1();
		Demo1 obj4 = new Demo1();
		
		
		obj1.x = 10;
		obj2.x = 100;
		
		out.println(obj2.x);// 100; // 2. out is imported as static 
		out.println(obj1.y+" "+obj2.y);
	
	    // ------------ From Different Package --------
		//MyBankClass obj = new MyBankClass();
	
		String str = bankName; // no need to mention class , bcoz import static
	}
	
	public void doStuff()
	{
		x = 100;
		y = 99; // static variable is directly available in non-static block
	}
	
	
}






