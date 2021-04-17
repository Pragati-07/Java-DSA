import java.util.Scanner;

public class LargestRowColumn {

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
			
			int largestRow = Integer.MIN_VALUE;
			int r=0,c=0;
			int largestCol= Integer.MIN_VALUE;
			int sum;
			for(int i=0;i<N;i++) {
				sum=0;
				for(int j=0;j<M;j++) {
					sum += arr[i][j];
				}
				if(largestRow<sum) {
					largestRow = sum;
					r=i;
				}
			}
			
			for(int j=0; j<M; j++) {
				sum=0;
				for(int i=0; i<N; i++) {
					sum += arr[i][j];
				}
				if(largestCol<sum) {
					largestCol = sum;
					c=j;
				}
			}
			
			if(largestRow>=largestCol) {
				System.out.print("row "+r+" "+largestRow);
			}else {
				System.out.print("column "+c+" "+largestCol);
			}
			
			t--;
		}

	}

}

