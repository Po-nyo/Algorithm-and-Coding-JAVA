package kakao_friends_coloring_book;

public class Solution {
	
	private int areaSize;
	private boolean isArea;
	
	public int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        for(int i=0; i<picture.length; i++) {
        	for(int j=0; j<picture[i].length; j++) {
        		if(picture[i][j] != -1) {
		        	this.areaSize = 0;
		        	this.isArea = true;
		        	dfs(picture, i, j, picture[i][j]);
		        	
		        	if(isArea) {
		        		numberOfArea++;
			        	if(this.areaSize > maxSizeOfOneArea)
			        		maxSizeOfOneArea = this.areaSize;
		        	}
        		}
        	}
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
	}
	
	private void dfs(int[][] picture, int row, int col, int color) {
		if(picture[row][col] != color)
			return;
		else {
			picture[row][col] = -1;
			this.areaSize++;
			
			int[] rowDirection = {-1, 0, 0, 1};
			int[] colDirection = {0, -1, 1, 0};
			
			for(int i=0; i<4; i++) {
				int movedRow = row + rowDirection[i];
				int movedCol = col + colDirection[i];
				
				if(inRange(picture, movedRow, movedCol)) {
					if(picture[movedRow][movedCol] != -1)
						dfs(picture, movedRow, movedCol, color);
				}
				else {
					if(color == 0)
						this.isArea = false;
				}
			}
		}
	}
	
	private boolean inRange(int[][] picture, int row, int col) {
		return (row >= 0 && row < picture.length && col >= 0 && col < picture[0].length);
	}
}
