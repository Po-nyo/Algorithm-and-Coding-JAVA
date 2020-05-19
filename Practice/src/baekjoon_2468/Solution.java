package baekjoon_2468;

public class Solution {
	private int[][] area;
	private boolean[][] visited;
	private int[] rowDirection = {-1, 0, 0, 1};
	private int[] colDirection = {0, -1, 1, 0};
	
	public void solution(int[][] heights, int max_value) {
		int max_count = 1;
		
		for(int i=1; i<=max_value; i++) {
			visited = new boolean[heights.length][heights.length];
			this.area = findArea(heights, i);
			int area_count = 0;
			
			for(int j=0; j<area.length; j++) {
				for(int k=0; k<area.length; k++) {
					if(area[j][k] == 1)
						area_count += callDFS(j, k);
				}
			}
			
			if(max_count < area_count)
				max_count = area_count;
		}
		
		System.out.println(max_count);
	}
	
	private int[][] findArea(int[][] heights, int h) {
		int[][] area = new int[heights.length][heights.length];
		
		for(int i=0; i<area.length; i++) {
			for(int j=0; j<area.length; j++) {
				if(heights[i][j] > h)
					area[i][j] = 1;
			}
		}
		
		return area;
	}
	
	private int callDFS(int row, int col) {
		if(visited[row][col])
			return 0;
		else {
			dfs(row, col);
			return 1;
		}
	}
	
	private void dfs(int row, int col) {
		visited[row][col] = true;
		
		for(int i=0; i<4; i++) {
			int movedRow = row + rowDirection[i];
			int movedCol = col + colDirection[i];
			
			if(inRange(movedRow, movedCol)) {
				if(area[movedRow][movedCol] == 1 && !visited[movedRow][movedCol])
					dfs(movedRow, movedCol);
			}
		}
	}
	
	private boolean inRange(int row, int col) {
		return (row >= 0 && row < area.length && col >= 0 && col < area.length);
	}

}
