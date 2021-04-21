import java.util.Scanner;

/*
 * Problem Description: Given k, find the geometric sum i.e. 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)  using recursion.
 * */
public class GeometricSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double K = sc.nextInt();
		System.out.print(geometricSum(K));
		sc.close();
	}

	private static double geometricSum(double k) {
		if(k<0)
			return 0;
		
		return 1/Math.pow(2, k) + geometricSum(k-1);
	}

}
