package alphabet_operator;

/**
 * 문제
 * 
 * 알파벳으로만 이루어진 계산기가 있다.
 * A~J 는 0~9 를 뜻하며, P는 더하기, S는 빼기, T는 곱하기, V는 나누기를 뜻한다.
 * 다른 문자는 입력되지 않는다.
 * 예를 들어, "BDAPCC"는 130+22 를 의미한다.
 * 이 계산기는 연산자 우선순위를 고려하지 않고 입력된 순서대로 연산을 진행하며, 수식이 올바르지 못한 경우 오류가 발생한다.
 * 입력된 문장의 계산 결과를 출력하라.
 * 계산과정에서 모든 결과값은 int 범위를 벗어나지 않으며, 오류가 난 경우에는 "Error"를 출력한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MyCalculator myCalculator = new MyCalculator();
		
		while(scan.hasNextLine()) {
			String exp = scan.nextLine();
			myCalculator.run(exp);
		}
		
		scan.close();
	}
}
