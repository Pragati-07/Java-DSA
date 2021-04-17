import java.util.Scanner;

public class SwapAlternate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			for(int i=0;i<n-1;i+=2) {
				swap(arr,i,i+1);
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			t--;
		}
		s.close();

	}
	
	public static void swap(int a[],int m,int n) {
		int k = a[m];
		a[m] = a[n];
		a[n] = k;
	}

}
