package towersOfHanoi;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * Towers of Hanoi (하노이의 탑)
 * n 이 주어지면 가장 왼쪽 기둥의 원판들을
 * 가장 오른쪽 기둥으로 옮기는 작업을 출력해줌
 * (재귀호출로 구현)
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		TowersOfHanoi hanoi = new TowersOfHanoi(n);
		hanoi.solve();
		
		sc.close();
	}

}
