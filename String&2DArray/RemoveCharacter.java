import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char ch = str2.charAt(0);
		String newStr="";
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) != ch) {
				newStr+=str1.charAt(i);
			}
		}
		System.out.print(newStr);
		
	}

}
