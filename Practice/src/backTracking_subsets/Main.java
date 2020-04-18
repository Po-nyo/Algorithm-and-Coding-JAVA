package backTracking_subsets;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * n이 입력되면,
 * 1부터 n까지의 숫자로 이루어진 집합의
 * 부분집합을 back-tracking으로 구함
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		System.out.println("Entered N : "+n);
		Subsets subsets = new Subsets(n);
		subsets.printSubsets();
		
		sc.close();
		
	}

}
