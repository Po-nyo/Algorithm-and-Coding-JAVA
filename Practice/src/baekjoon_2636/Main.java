package baekjoon_2636;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] cheese = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++)
				cheese[i][j] = sc.nextInt();
		}
		
		Solution s = new Solution();
		s.solution(cheese);
		
		sc.close();

	}

}
