import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			System.out.print(findSecondLargest(arr,n));
			t--;
		}
		s.close();

	}

	public static int findSecondLargest(int[] arr, int n) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max1 = arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>max2 && arr[i]<max1) {
				max2 = arr[i];
			}
		}
		if(max1==max2) {
			return Integer.MIN_VALUE;
		}else {
			return max2;
		}
	}
}
