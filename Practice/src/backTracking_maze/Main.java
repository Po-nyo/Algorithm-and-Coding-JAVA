package backTracking_maze;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * 장애물이 있는 m x n 크기의 미로에서
 * (0,0)에서 출발하여 (m-1,n-1) 위치로
 * 가는 경로가 존재하는지 판별해준다.
 * (한 번에 한 칸씩 오른쪽이나 아래로만 이동 가능)
 * 1은 장애물이 있는 곳, 0은 없는 곳
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();	// 행
		int n = sc.nextInt();	// 열
		int[][] maze = new int[m][n];	//	미로
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++)
				maze[i][j] = sc.nextInt();
		}
		
		Maze mz = new Maze(maze);
		if(mz.isPathExist())
			System.out.println("Solutions Exist");
		else
			System.out.println("No Solutions");
		
		sc.close();
		
	}

}
