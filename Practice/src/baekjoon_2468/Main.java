package baekjoon_2468;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] heights = new int[n][n];
		int max_value = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				heights[i][j] = sc.nextInt();
				if(max_value < heights[i][j])
					max_value = heights[i][j];
			}
		}
		
		Solution s = new Solution();
		s.solution(heights, max_value);
		
		sc.close();

	}

}
