import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			int d=s.nextInt();
			int p=d,i=0;
			while(p<n) {
				arr[i]=arr[p];
				p++;
				i++;
			}
			while(i<n) {
				arr[i]=d;
				d--;
				i++;
			}
			
			for(int j=0;j<n;j++) {
				System.out.print(arr[j]+" ");
			}
			t--;
		}
		s.close();

	}

}
