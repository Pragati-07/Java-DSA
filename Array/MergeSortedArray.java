import java.util.Scanner;

public class MergeSortedArray {

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
			
			int[] arr3 = new int[n+m];
			int j=0,k=0,i=0;
			for(; i<n+m; i++) {
				if(j==n || k==m)
					break;
				if(arr1[j]<=arr2[k]) {
					arr3[i]=arr1[j];
					j++;
				}else {
					arr3[i]=arr2[k];
					k++;
				}
			}
			
			while(j!=n) {
				arr3[i] = arr1[j];
				j++;
				i++;
			}
			
			while(k!=m) {
				arr3[i] = arr2[k];
				i++;
				k++;
			}
			
			for(i=0;i<n+m;i++) {
				System.out.print(arr3[i]+" ");
			}
			t--;
			
		}
		s.close();

	}

}
