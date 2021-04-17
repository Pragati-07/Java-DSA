import java.util.Scanner;

public class SortZeroOne {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			sortZeroOne(n,arr);
			t--;
		}
		s.close();

	}

	private static void sortZeroOne(int n, int[] arr) {
		int zero=0, one=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				zero++;
			}else {
				one++;
			}
		}
		
		for(int i=0;i<zero;i++) {
			System.out.print("0"+" ");
		}
		for(int i=0;i<one;i++) {
			System.out.print("1"+" ");
		}
		
	}

}
