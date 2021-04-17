import java.util.Scanner;

public class DuplicateNumber {
	
	public static int duplicateNum(int[] arr, int n) {
		int sum =(int) (n-2)*(n-1)/2;
		int sum_arr = 0;
		for(int i=0;i<n;i++) {
			sum_arr+=arr[i];
		}
		return sum_arr-sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			int d = duplicateNum(arr,n);
			System.out.println(d);
			t--;
		}
		s.close();

	}

}
