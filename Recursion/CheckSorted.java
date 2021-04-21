
public class CheckSorted {

	public static void main(String[] args) {
		int input[]= {3,3,5,7,9};
		System.out.print(checkSorted(input,0));
	}

	private static boolean checkSorted(int[] input,int startIndex) {
		if(startIndex>=input.length-1)
			return true;
		if(input[startIndex]>input[startIndex+1])
			return false;
		return checkSorted(input,startIndex+1);
	}

}
