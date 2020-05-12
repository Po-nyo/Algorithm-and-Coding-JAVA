package backTracking_NQueens;

public class N_Queens {
	
	int n;
	int cnt;
	
	public N_Queens(int n) {
		this.n = n;
		this.cnt = 0;
	}
	
	public void solution() {
		int[] queens = new int[n]; // index를 행, 원소를 열로 생각
		
		backtrack(queens, 0);
		System.out.println("솔루션의 갯수 : "+cnt);
	}
	
	private void backtrack(int[] queens, int row) {
		if(row == n) {
			printSolution(queens);
			cnt++;
		}
		else {
			for(int i=0; i<queens.length; i++) {
				if(isPromising(queens, row, i)) {
					queens[row] = i;
					backtrack(queens, row+1);
				}
			}
		}
	}
	
	private boolean isPromising(int[] queens, int row, int i) {
		
		for(int j=0; j<row; j++) {
			if(queens[j] == i ||
			   queens[j]+(row-j) == i ||
			   queens[j]-(row-j) == i) {
				return false;
			}
		}
		
		return true;
	}
	
	private void printSolution(int[] queens) {
		
		for(int i=0; i<queens.length; i++) {
			for(int j=0; j<queens.length; j++) {
				if(queens[j] == i)
					System.out.print(" Q ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void setN(int n) {
		this.n = n;
		this.cnt = 0;
	}
}
