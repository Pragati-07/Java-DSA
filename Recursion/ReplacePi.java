import java.util.Scanner;

/*
 * Problem Description: Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
 * */
public class ReplacePi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(replacePi(str));
		sc.close();

	}

	private static String replacePi(String str) {
		if(str.length()<2)
			return str;
		if(str.charAt(0)=='p' && str.length()>=2 && str.charAt(1)=='i')
			return "3.14" + replacePi(str.substring(2));
		
		return str.charAt(0) + replacePi(str.substring(1));
	}

}
