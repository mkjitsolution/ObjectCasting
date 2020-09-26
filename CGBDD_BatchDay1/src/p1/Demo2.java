package p1;

public class Demo2 {

	public static void main(String[] args) {
		
		int x = 9;
		
		//if(//....  boolean...other than boolean will be an error)
		
		// if(x =100 ) // x = 100 gives us integer result , & leads to error
		
		boolean a = true;
		boolean b = false;
		
		/*
		 * if(a && (b=true)) //Or { System.out.println("its valid"); }
		 * 
		 * System.out.println("b :- "+b);
		 */
		
		if(!a & (b=true)) 
		{
			System.out.println("its valid");
		}
		
		System.out.println("b :- "+b);
		
		
	}
}
