/*
 * Problem Description: Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. 
 * Save all the indexes in an array (in increasing order).
 * Do this recursively. Indexing in the array starts from 0.
 * */


import java.util.Scanner;

public class AllIndices {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt();
		int x = s.nextInt();
		int ans[] = findAllIndices(arr,x,0);
		for(int i=0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
		s.close();

	}

	private static int[] findAllIndices(int[] arr, int x, int i) {
		if(i==arr.length) {
			int[] ans = new int[0];
			return ans;
		}
		
		int smallAns[] = findAllIndices(arr,x,i+1);
		
		if(arr[i]==x) {
			int myAns[] = new int[smallAns.length+1];
			myAns[0]=i;
			for(int j=0;j<smallAns.length;j++)
				myAns[j+1] = smallAns[j];
			return myAns;
		}else {
			return smallAns;
		}
		
	}

}
