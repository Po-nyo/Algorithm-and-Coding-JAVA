package backTracking_maze;

public class Maze {
	
	private int[][] maze;
	private boolean solved;

	public Maze(int[][] maze) {
		this.maze = maze;
	}
	
	public boolean isPathExist() {
		backtrack(0, 0);
		return solved;
	}
	
	private void backtrack(int row, int col) {
		if(row==maze.length-1 && col==maze[0].length-1 || solved) {
			solved = true;
		}
		else {
			int[] rowDirection = {1, 0};
			int[] colDirection = {0, 1};
			
			for(int i=0; i<rowDirection.length; i++) {
				if(isPromising(row+rowDirection[i], col+colDirection[i]))
					backtrack(row+rowDirection[i], col+colDirection[i]);
			}
		}
	}
	
	private boolean isPromising(int row, int col) {
		return (row<maze.length && col<maze[0].length && maze[row][col]!=1);
	}

}
