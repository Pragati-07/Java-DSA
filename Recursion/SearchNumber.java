import java.util.Scanner;

/*
 * Problem Description: Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
 * Do this recursively. 
 * */
public class SearchNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int elem = sc.nextInt();
		System.out.print(checkNumber(arr,elem,0));
		sc.close();

	}

	private static boolean checkNumber(int[] arr, int elem,int startIndex) {
		if(startIndex>=arr.length)
			return false;
		if(arr[startIndex]==elem)
			return true;
		return checkNumber(arr,elem,startIndex+1);
	}

}
