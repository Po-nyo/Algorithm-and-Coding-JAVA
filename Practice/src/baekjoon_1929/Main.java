package baekjoon_1929;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[] isNotPrimeNumber = new boolean[n+1];
		
		if(n>=2) {
			for(int i=2; i<=n/2; i++) {
				for(int j=2; i*j<=n; j++) {
					isNotPrimeNumber[i*j] = true;
				}
			}
			
			isNotPrimeNumber[1] = true;
			isNotPrimeNumber[2] = false;
		
			for(int i=m; i<=n; i++) {
				if(!isNotPrimeNumber[i])
					System.out.println(i);
			}
		}
		
		sc.close();
		
	}
}