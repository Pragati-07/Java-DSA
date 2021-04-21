import java.util.Scanner;

/*
 * Problem Description:Given the code to find out and return the number of digits present in a number recursively.
 * */
public class NumberOfDigits {

	public static int countDigits(int n) {
		if(n/10 == 0)
			return 1;
		return 1+countDigits(n/10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(countDigits(n));
		sc.close();
	}

}
