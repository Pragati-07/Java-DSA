import java.util.Scanner;

public class RemoveX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(remove(str));
		sc.close();
	}

	private static String remove(String str) {
		if(str.length()<1)
			return str;
		if(str.charAt(0)=='x')
			return remove(str.substring(1));
		return str.charAt(0)+remove(str.substring(1));
	}

}
