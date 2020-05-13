package baekjoon_2798;
/**
 * @author wkj11
 * [백준 2798] 블랙잭
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cardNum = new int[n];
		int answer = 0;
		
		for(int i=0; i<n; i++)
			cardNum[i] = sc.nextInt();
		
		Arrays.sort(cardNum);
		
		for(int i=n-1; i>=2; i--) {
			for(int j=i-1; j>=1; j--) {
				for(int k=j-1; k>=0; k--) {
					int currentSum = cardNum[i]+cardNum[j]+cardNum[k];
					if(currentSum <= m)
						answer = Math.max(currentSum, answer);
				}
			}
		}
		
		System.out.println(answer);
		
		sc.close();

	}

}
