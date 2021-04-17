import java.util.Scanner;

public class StringPalindrome {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(checkPalindrome(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

	private static boolean checkPalindrome(String str) {
		int j=str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}

}
