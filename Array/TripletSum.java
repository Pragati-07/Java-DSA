import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {
		// Brute Force Method
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			int sum = s.nextInt();
			System.out.println(findAllTriplet(n,arr,sum));
			t--;
		}
		s.close();


	}

	public static int findAllTriplet(int n, int[] arr, int sum) {
		int count = 0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k] == sum) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
