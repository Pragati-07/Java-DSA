import java.util.Scanner;

public class CompressString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		char[] ch = str1.toCharArray();
		int c=1,i;
		String s ="";
		for(i=0;i<ch.length-1;i++) {
			if(ch[i]!=ch[i+1]) {
				s+=ch[i];
				if(c>1)
					s+=c;
				c=1;
			}else {
				c++;
			}
		}
		s+=ch[i];
		if(ch[i]==ch[i-1])
			s+=c;
			
		System.out.print(s);
	}

}
