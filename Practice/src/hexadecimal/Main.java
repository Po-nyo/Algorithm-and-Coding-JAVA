package hexadecimal;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * 10진수 숫자가 입력되면 16진수로,
 * 16진수 숫자가 입력되면 10진수로 바꾸어 출력
 * (16진수의 경우 앞에 0x가 붙는 것으로 생각)
 * "exit" 입력 시 종료
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		
		DecHexService dhs = new DecHexService();
		while(true) {
			System.out.print("입력 : ");
			input = sc.nextLine();
			if(input.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.print(input+" >>> ");
			System.out.println(dhs.getConvertedValue(input));
		}
		sc.close();
	}

}
