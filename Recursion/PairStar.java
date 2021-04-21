/*
 * Problem Description: Given a string S, compute recursively a new string where identical chars that are adjacent 
 * in the original string are separated from each other by a "*".
 * */

import java.util.Scanner;

public class PairStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(pairStar(str));
		sc.close();
	}

	private static String pairStar(String str) {
		if(str.length()<=1)
			return str;
		
		if(str.charAt(0)==str.charAt(1))
			return str.charAt(0)+"*"+pairStar(str.substring(1));
		
		return str.charAt(0)+pairStar(str.substring(1));
	}

}
