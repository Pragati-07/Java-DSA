/*
 * Problem Description: Write a program to find x to the power n (i.e. x^n). Take x and n from the user. 
 * You need to return the answer.Do this recursive
 * */

import java.util.Scanner;

public class XtoPowerN {

	public static int power(int x, int n) {
		if(n==0)
			return 1;
		return x*power(x,n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(power(x,n));
		s.close();
	}

}
