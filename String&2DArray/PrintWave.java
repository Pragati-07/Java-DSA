import java.util.Scanner;

public class PrintWave {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0) {
			
			int N = s.nextInt();
			int M = s.nextInt();
			int[][] arr = new int[N][M];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					arr[i][j]=s.nextInt();
				}
			}
			
			printWaveMatrix(arr);
			t--;
		}
	}

	private static void printWaveMatrix(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int i,j=0;
		while(j<m) {
			i=0;
			while(i<n) {
				System.out.print(arr[i][j]+" ");
				i++;
			}
			j++;
			i--;
			while(i>=0 && j<m) {
				System.out.print(arr[i][j]+" ");
				i--;
			}
			j++;
		}
	}

}

