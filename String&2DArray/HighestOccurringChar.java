import java.util.ArrayList;
import java.util.Scanner;
public class HighestOccurringChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		char[] ch = str1.toCharArray();
		int[] arr = new int[256];
		for(int i=0;i<ch.length;i++) {
			arr[ch[i]]+=1;
		}
		int high = 0;
		ArrayList<Integer> index = new ArrayList<Integer>();
		for(int i=0;i<256;i++) {
			if(high<=arr[i]) {
				high=arr[i];
			}
		}
		for(int i=0;i<256;i++) {
			if(arr[i]==high) {
				index.add(i);
			}
		}
		int minIndex = Integer.MAX_VALUE;
		for(int i=0;i<index.size();i++) {
			int t = (int)index.get(i);
			int ind = str1.indexOf((char)t);
			if(minIndex>ind)
				minIndex = ind;
			
		}
		System.out.println(str1.substring(minIndex,minIndex+1));
	}

}
