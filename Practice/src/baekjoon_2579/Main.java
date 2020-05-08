package baekjoon_2579;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 계단의 개수
		int[] score = new int[n];	// 각 계단의 점수
		
		for(int i=0; i<n; i++)
			score[i] = sc.nextInt();
		
		if(n == 1)
			System.out.println(score[0]);
		else if(n == 2)
			System.out.println(score[0]+score[1]);
		else
			System.out.println(solution(score));
		
		sc.close();
	}
	
	public static int solution(int[] score) {
		int[] dp = new int[score.length];
		
		
		dp[0] = score[0];
		dp[1] = score[0]+score[1];
		dp[2] = Math.max(score[0]+score[2], score[1]+score[2]);
		/* n-2번째 계단과 n번째 계단을 밟는 경우와 			*/
		/* n-3번째 계단, n-1번째 계단, n번째 계단을 밟는 경우 	*/
		/* 중에서 큰 값을 배열에 동적 프로그래밍으로 채워나간다.	*/
		for(int i=3; i<dp.length; i++)										
			dp[i] = Math.max(dp[i-2]+score[i], dp[i-3]+score[i-1]+score[i]);

		return dp[dp.length-1];
	}

}
