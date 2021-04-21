/*
 * Problem Description: Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. 
 * Return -1 if it is not present in the array.
   Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
   You should start traversing your array from 0, not from (N - 1).
   Do this recursively. Indexing in the array starts from 0.
 * */

import java.util.Scanner;

public class LastIndex {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt();
		int x = s.nextInt();
		
		System.out.println(lastIndex(arr,x,0));
		s.close();
	}

	private static int lastIndex(int[] arr, int x, int startIndex) {
		if(startIndex==arr.length)
			return -1;
	
		int index = lastIndex(arr,x,startIndex+1);
		
		if(index==-1 && arr[startIndex]==x)
			return startIndex;
		else
			return index;
		
		
	}
}
