package backTracking_NQueens;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * N Queens
 * 0이 아닌 정수 n이 주어졌을 때,
 * n x n 크기의 체스판에 n개의 퀸을
 * 서로 공격할 수 없도록 배치하는
 * 모든 방법을 찾아내어 출력한다.
 * (backtracking으로 구현)
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		N_Queens n_queens = new N_Queens(n);
		n_queens.solution();
		sc.close();

	}

}
