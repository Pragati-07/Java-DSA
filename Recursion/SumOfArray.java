/*
 * Problem Description: Given an array of length N, you need to find and return the sum of all elements of the array.
 * Do this recursively. 
 * */
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print(sumArray(arr,0));
		sc.close();
	}

	private static int sumArray(int[] arr,int startIndex) {
		if(startIndex>=arr.length)
			return 0;
		return arr[startIndex]+sumArray(arr,startIndex+1);
	}

}
