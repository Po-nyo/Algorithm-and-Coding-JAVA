package longestIncreasingSubsequence;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * 수열이 String으로 주어지면
 * 최장 증가 부분수열을 출력해줌
 * 동적 프로그래밍으로 구현
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		LIS lis = new LIS(str);
		System.out.println("LIS Length : " + lis.getMaxLength());
		System.out.println("LIS : "+lis.getLis());
		
		
		sc.close();
	}

}
