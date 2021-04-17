import java.util.Scanner;

public class CheckArrayRotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			System.out.print(checkArrayRotation(arr,n));
			t--;
		}
		s.close();

	}

	private static int checkArrayRotation(int[] arr, int n) {
		int i;
		for(i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				return i+1;
			}
		}
		return 0;
	}

}
