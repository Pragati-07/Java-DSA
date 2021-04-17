import java.util.Scanner;

public class FindUnique {
	
	public static int findSingleElement(int[] arr, int n) {
		int xor = arr[0];
		for(int i=1;i<n;i++) {
			xor = xor ^ arr[i];
		}
		return xor;
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
			int res = findSingleElement(arr,n);
			System.out.println(res);
			t--;
		}
		s.close();

	}

}
