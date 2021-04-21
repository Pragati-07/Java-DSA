/*
 * Problem Description: Given a String S of length n, print all its substrings. (Recursively)
 * Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S. 
 * */
import java.util.*;

public class AllSubstring {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		findSubstring(str,"");
		s.close();
	}

	private static void findSubstring(String str, String ans) {
		if(str.length()==0){
			if(ans!="")
				System.out.println(ans);
			return ; 
		}
		
		findSubstring(str.substring(1),ans+str.charAt(0));
		
		findSubstring(str.substring(1),ans);
		
	}

}
