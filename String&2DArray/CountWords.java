import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(countWords(str));
		s.close();
	}

	private static int countWords(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				c++;	
			}
		}
		return c+1;
	}

}
