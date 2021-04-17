import java.util.Scanner;

public class ReverseStringWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String revStr="";
		int j , i, prev = str.length();
		for(i=str.length()-1; i>0; i--) {
			if(str.charAt(i)==' ') {
				j=i+1;
				revStr += str.substring(j,prev)+" ";
				prev=i;
			}
		}
		revStr += str.substring(i,prev);
		System.out.print(revStr);
		s.close();

	}

}
