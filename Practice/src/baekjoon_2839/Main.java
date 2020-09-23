package baekjoon_2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		
		while(n >= 0) {
			if(n % 5 == 0) {
				count += n/5;
				break;
			}
			else {
				n -= 3;
				count++;
			}
		}
		
		if(n < 0)
			System.out.println(-1);
		else
			System.out.println(count);
		
		scan.close();
	}
}
