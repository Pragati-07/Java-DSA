import java.util.Scanner;

/*
 * Problem Description: Given an integer N, count and return the number of zeros that are present in the given integer using recursion.


 * */
public class CountZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		System.out.print(findZeros(M));
		sc.close();
	}

	private static int findZeros(int m) {
		if(m==0) {
			return 0;
		}
		return ((m%10==0)?1:0)+findZeros(m/10);
	}

}
