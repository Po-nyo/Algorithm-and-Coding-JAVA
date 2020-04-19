package backTracking_permutation;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * n이 입력되면,
 * 1부터 n까지의 수로 만들 수 있는
 * 모든 순열과 그 갯수를 출력한다.
 * (back-tracking으로 구현)
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		Permutation p = new Permutation(n);
		p.run();
		sc.close();
	}

}
