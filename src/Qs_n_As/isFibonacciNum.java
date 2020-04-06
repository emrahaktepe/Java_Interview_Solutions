package Qs_n_As;

import java.util.ArrayList;

public class isFibonacciNum {

	public static void main(String[] args) {
		
		System.out.println(isFibonacci(233));
		System.out.println(isFibonacci(3));

		
	}
	
	public static ArrayList<Integer> fibonacciNumbers(){
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		
		for (int i=0; i<100; i++) {
			if (list.get(i)+list.get(i+1)>1000)
				break;
	    list.add(list.get(i)+list.get(i+1));
		}
		
	    return list;
		
	}
	
	public static boolean isFibonacci(int num) {
		
		fibonacciNumbers();
		
		if(fibonacciNumbers().contains(num))
			return true;
		
		return false;
	}
	
	
	
}
