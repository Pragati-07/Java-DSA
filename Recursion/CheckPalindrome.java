import java.util.Scanner;

/*
 * Problem Description: Check whether a given String S is a palindrome using recursion. Return true or false.
 * */
public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(checkPalindrome(str));
		sc.close();

	}

	private static boolean checkPalindrome(String str) {
		if(str.length()<=1)
			return true;
		return isPalindrome(str,0,str.length()-1);
	}

	private static boolean isPalindrome(String str,int startIndex,int endIndex) {
		if(startIndex>=endIndex)
			return true;
		
		if(str.charAt(startIndex)==str.charAt(endIndex))
			return isPalindrome(str,startIndex+1,endIndex-1);
		else
			return false;
	}

}
