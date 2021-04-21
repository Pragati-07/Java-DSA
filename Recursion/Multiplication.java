import java.util.Scanner;

/*
 * Problem Description: Given two integers M & N, calculate and return their multiplication using recursion. 
 * You can only use subtraction and addition for your calculation. No other operators are allowed.

 * */
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		System.out.println(multiply(M,N));
		sc.close();

	}

	private static int multiply(int m, int n) {
		if(n==0)
			return 0;
		if(n>m)
			return multiply(n,m);
		else
			return m+multiply(m,n-1);
	}

}
