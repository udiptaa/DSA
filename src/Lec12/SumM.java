package Lec12;

public class SumM {

	public static void main(String[] args) {
		System.out.println(Sum(10));

	}
	public static int Sum(int n) {
		
		if(n==1)return 1;
		
		int sm= Sum(n-1);
		
		return n+sm;
		
	}

}
