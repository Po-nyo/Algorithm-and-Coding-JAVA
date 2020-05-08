package baekjoon_3055;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	private char[][] map;		// 티떱숲 맵
	private int[][] pathCnt;
	private MyPoint beaver;		// 비버굴 위치

	public Solution(char[][] map) {
		this.map = map;
	}
	
	public void call() {
		this.pathCnt = bfs(map);
		
		if(pathCnt[beaver.getRow()][beaver.getCol()] != 0)
			System.out.println(pathCnt[beaver.getRow()][beaver.getCol()]);
		else
			System.out.println("KAKTUS");
	}

	private int[][] bfs(char[][] map) {
		int rows = map.length; 
		int cols = map[0].length;
		int[][] pathCnt = new int[rows][cols];

		Queue<MyPoint> q = new LinkedList<>();

		int[] moveR = {-1, 0, 1, 0}; 
		int[] moveC = {0, -1, 0, 1};

		// 모든 물의 위치를 먼저 큐에 입력
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				if(map[i][j] == '*')
					q.add(new MyPoint(i,j,'*'));   
		}
		// 고슴도치 위치를 물 다음으로 큐에 입력
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				if(map[i][j] == 'S')
					q.add(new MyPoint(i,j,'S'));   
		}

		while(!q.isEmpty()) { 
			MyPoint p = q.poll(); 

			for(int i=0; i<4; i++) { 
				int movedR = p.getRow() + moveR[i];
				int movedC = p.getCol() + moveC[i];

				if(movedR >= 0 && movedR < rows && movedC >= 0 && movedC < cols) {
					// 움직였을때 티떱숲 map을 벗어나지 않으면 실행
					if(p.getElement() == '*') { // 지금 q에서 꺼낸위치가 물의 위치일 때
						if(map[movedR][movedC] !='X' && map[movedR][movedC] != 'D' && map[movedR][movedC] != '*') {
							// 물이 진행하지 못하는 방향이 아니면 실행
							map[movedR][movedC] = '*';
							q.add(new MyPoint(movedR, movedC, p.getElement()));
						}
					}
					if(p.getElement() == 'S') { 
						if(map[movedR][movedC] != 'X' && ( map[movedR][movedC] == 'D' || map[movedR][movedC] == '.')) {
							// 고슴도치가 진행할 수 있는 방향이면 실행
							pathCnt[movedR][movedC] = pathCnt[p.getRow()][p.getCol()]+1;
							
							if(map[movedR][movedC] == 'D') { 	// 움직인 위치가 비버굴인 경우
								this.beaver = new MyPoint(movedR, movedC, 'D');
								return pathCnt;
							}
							
							map[movedR][movedC] = 'S'; // 움직인 위치에 고슴도치 표시
							q.add(new MyPoint(movedR, movedC, p.getElement()));
						}
					}   
				}
			}
		}
		return pathCnt;
	}

}
