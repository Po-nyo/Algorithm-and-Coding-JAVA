package baekjoon_2953;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int winner = 0;
		int maxScore = 0;
		
		for(int i=0; i<5; i++) {
			int sum = 0;
			for(int j=0; j<4; j++)
				sum += sc.nextInt();
			
			if(maxScore < sum) {
				winner = i;
				maxScore = sum;
			}
		}
		
		System.out.println((winner+1)+" "+maxScore);
		
		sc.close();

	}

}
