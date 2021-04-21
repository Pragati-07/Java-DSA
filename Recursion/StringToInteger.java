import java.util.Scanner;

/*
 * Problem Description: Write a recursive function to convert a given string into the number it represents. 
 * That is input will be a numeric string that contains only numbers, you need to convert the string into 
 * corresponding integer and return the answer.
 * */
public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(strToInt(str));
		sc.close();
	}

	private static int strToInt(String str) {
		if(str.length()==1)
			return (str.charAt(0)-'0');
		
		return (int)((str.charAt(0)-'0')*Math.pow(10, str.length()-1) + strToInt(str.substring(1)));
	}

}
