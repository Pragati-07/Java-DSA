import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String revStr="";
		int prev = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				revStr+=reverseStr(str.substring(prev,i))+" ";
				prev = i+1;
			}
		}
		
		revStr += reverseStr(str.substring(prev));
		System.out.print(revStr);
	}

	private static String reverseStr(String str) {
		char[] ch = str.toCharArray();
		String s="";
		for(int i = ch.length-1; i>=0; i--) {
			s+=ch[i];
		}
		return s;
	}
	

}
