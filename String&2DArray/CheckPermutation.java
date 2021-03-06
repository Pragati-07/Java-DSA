import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.print(checkPermutation(str1,str2));

	}

	private static boolean checkPermutation(String str1, String str2) {
		
		if(str1.length()==str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0; i<ch1.length; i++) {
				if(ch1[i]!=ch2[i])
					return false;
			}
			return true;
		}
		return false;
	}

}

