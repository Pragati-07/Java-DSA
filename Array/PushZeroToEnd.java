import java.util.Scanner;

public class PushZeroToEnd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			pushZero(n,arr);
			t--;
		}
		s.close();

	}

	public static void pushZero(int n, int[] arr) {
		int zero=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}else {
				zero++;
			}
		}
		while(zero!=0) {
			System.out.print("0"+" ");
			zero--;
		}
		
	}

}
