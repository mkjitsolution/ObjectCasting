package p1;

class CG {
	public Work doThings(Hr hr) {
		// 1000 lines of code
		return null;
	}
	
	public int doSum(int... x)
	{
		int sum = 0;
		for (int i : x) {
			sum+=i;
		}
		return sum;
	}
}

class Hr {
}

class Work {
}

public class Demo4 {

	public static void main(String[] args) {
       // ---- call doThings () ----
		
		int sum = 0;
		CG cg = new CG();
		sum = cg.doSum(8,5);
		System.out.println("Sum "+sum); // 13, or 0
	}
}
