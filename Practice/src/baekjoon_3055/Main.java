package baekjoon_3055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      int rows = sc.nextInt(); // 티떱숲 행의 길이
	      int cols = sc.nextInt(); // 티떱숲 열의 길이
	      String input;
	      
	      char[][] map = new char[rows][cols]; // 티떱숲 지도 생성
	      
	      for(int i=0;i<rows;i++) { // 티떱숲 지도 입력
	         input = sc.next();
	         for(int j=0; j<cols; j++)
	            map[i][j] = input.charAt(j);
	      }
	      
	      Solution s = new Solution(map);
	      s.call();
	      
	      sc.close();
	}

}
