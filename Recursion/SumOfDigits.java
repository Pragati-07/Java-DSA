import java.util.Scanner;

/**
 * Problem Description: Write a recursive function that returns the sum of the digits of a given integer.
 */
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		System.out.print(sum(num));
		sc.close();
	}

	private static int sum(double num) {
		if(num==0)
			return 0;
		
		return (int)num%10 + sum((int)num/10);
	}

}
