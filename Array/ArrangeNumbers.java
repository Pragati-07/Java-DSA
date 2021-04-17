import java.util.Scanner;
public class ArrangeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			arr = populateArray(arr);
			print(arr);
			t--;
		}
		s.close();
	}
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] populateArray(int[] arr) {
		int s = arr.length;
		int j = 1, k=s ,l=1;
		for(int i=0;i<s;i++) {
			if(j%2==0) {
				arr[k-1]=j;
				k--;
			}else {
				arr[l-1]=j;
				l++;
			}
			j++;
		}
		return arr;
	}

}
