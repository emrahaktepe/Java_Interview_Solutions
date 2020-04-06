package Qs_n_As;

//	Swap two variables' values without using temp variable

public class SwapTwoNumbersWithoutTemp {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 22;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a= " + a +" " + "b= " + b);
		
	}
	
}
