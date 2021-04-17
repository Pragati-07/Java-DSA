import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt();
		int t = s.nextInt();
		while(t!=0) {
			int elem = s.nextInt();
			int index = binarySearch(arr,elem);
			System.out.println(index);
			t--;
		}
			
		s.close();

	}

	public static int binarySearch(int[] arr, int elem) {
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==elem)
				return mid;
			else if(arr[mid]<elem)
				start = mid+1;
			else
				end = mid-1;
		}
		return -1;
	}

}
