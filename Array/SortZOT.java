import java.util.Scanner;

public class SortZOT {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			sort(arr,n);
			t--;
		}
		s.close();

	}

	private static void sort(int[] arr, int n) {
		int low=0, high=n-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				arr[i]=arr[low];
				arr[low]=0;
				low++;
			}else if(arr[i]==2) {
				arr[i]=arr[high];
				arr[high]=2;
				high--;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
