package baekjoon_2636;

public class Solution {
	private int[][] cheese;
	private int cheese_count;
	private int[] rowDirection = {-1, 0, 0, 1};
	private int[] colDirection = {0, -1, 1, 0};
	private boolean[][] visited;
	
	public void solution(int[][] cheese) {
		this.cheese = cheese;
		this.cheese_count = 0;
		
		callDFS(0, 0);
		int count = 0;
		
		while(count_cheese() != 0) {
			process();
			callDFS(0, 0);
			count++;
		}
		
		System.out.println(count);
		System.out.println(cheese_count);
	}
	
	private void callDFS(int row, int col) {
		visited = new boolean[cheese.length][cheese[0].length];
		dfs(row, col);
	}
	
	private void dfs(int row, int col) {
		if(inRange(row, col)) {
			if(cheese[row][col] != 1 && !visited[row][col]) {
				visited[row][col] = true;
				cheese[row][col] = -1;
				
				for(int i=0; i<4; i++) {
					int movedRow = row + rowDirection[i];
					int movedCol = col + colDirection[i];
					
					dfs(movedRow, movedCol);
				}
			}
		}
	}
	
	private void process() {
		int[][] clone = new int[cheese.length][cheese[0].length];
		
		for(int i=0; i<cheese.length; i++) {
			for(int j=0; j<cheese[0].length; j++)
				clone[i][j] = this.cheese[i][j];
		}
		
		for(int i=0; i<clone.length; i++) {
			for(int j=0; j<clone[i].length; j++) {
				if(clone[i][j] == -1) {
					for(int k=0; k<4; k++) {
						int movedRow = i + rowDirection[k];
						int movedCol = j + colDirection[k];
						
						if(inRange(movedRow, movedCol)) {
							cheese[movedRow][movedCol] = -1;
						}
					}
				}
			}
		}
	}
	
	private int count_cheese() {
		int count = 0;
		for(int[] arr : cheese) {
			for(int i : arr) {
				if(i == 1)
					count++;
			}
		}
		
		if(count != 0)
			this.cheese_count = count;
		
		return count;
	}
	
	private boolean inRange(int row, int col) {
		return (row >= 0 && row < cheese.length && col >= 0 && col <cheese[0].length);
	}

}
