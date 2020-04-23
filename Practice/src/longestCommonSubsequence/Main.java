package longestCommonSubsequence;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * 두 개의 String이 입력되면 
 * 최장 공통 부분수열과 그 길이를 출력해줌
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.print("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		LCS lcs = new LCS(str1, str2);
		lcs.print();
		sc.close();

	}

}
