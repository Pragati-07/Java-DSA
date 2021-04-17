import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr1 = new int[n];
			for(int i=0;i<n;i++) {
				arr1[i] = s.nextInt();
			}
			int m = s.nextInt();
			int[] arr2 = new int[m];
			for(int i=0;i<m;i++) {
				arr2[i] = s.nextInt();
			}
			findArrayIntersection(n,arr1,m,arr2);
			t--;
		}
		s.close();

	}

	private static void findArrayIntersection(int n, int[] arr1, int m, int[] arr2) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr2[j]=-1;
					break;
				}
			}
		}
		
	}

}
