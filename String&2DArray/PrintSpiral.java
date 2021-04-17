import java.util.*;
public class PrintSpiral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int matrix[][] =  new int[r][c];
			for(int i=0 ; i<r; i++)
				for(int j=0; j<c; j++)
					matrix[i][j] = sc.nextInt();
			ArrayList<Integer> ans = spirallyTraverse(matrix, r, c);
			for(Integer val : ans)
				System.out.print(val+" ");
			System.out.println();
		}
	}

	private static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c) {
		int top = 0, down = r-1, left = 0, right = c-1;
		int dir=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(top<=down && left<=right) {
			if(dir == 0) {
				for(int i=left; i<=right; i++)
					arr.add(matrix[top][i]);
				top+=1;
			}
			else if(dir == 1) {
				for(int i=top; i<=down ; i++)
					arr.add(matrix[i][right]);
				right-=1;
			}
			else if(dir == 2) {
				for(int i=right; i>=left; i--)
					arr.add(matrix[down][i]);
				down-=1;
			}
			else if(dir == 3) {
				for(int i=down; i>=top; i--)
					arr.add(matrix[i][left]);
				left+=1;
			}
			dir = (dir+1)%4;
		}
		return arr;
	}

}

