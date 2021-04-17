import java.util.Scanner;

public class RowWiseSum {

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
			int sum;
			for(int i=0;i<N;i++) {
				sum=0;
				for(int j=0;j<M;j++) {
					sum += arr[i][j];
				}
				System.out.print(sum+" ");
			}
			
			t--;
		}

	}

}
