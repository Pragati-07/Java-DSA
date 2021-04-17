import java.util.Scanner;

public class RemoveConsecutiveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		char prev = ch[0];
		String newStr = ""+prev;
		for(int i=1;i<ch.length;i++) {
			if(ch[i]!=prev) {
				newStr+=ch[i];
				prev=ch[i];
			}
		}
		System.out.println(newStr);
	}

}
