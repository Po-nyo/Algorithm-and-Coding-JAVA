package editDistance;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * String 두개를 입력받아 두 String 사이의
 * 편집거리(Edit Distance)와 작업내역, 
 * 부분문자열에 대한 편집거리 배열을 출력해준다.
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.print("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		EditDistance ed = new EditDistance(str1, str2);
		ed.call();
		
		sc.close();
	}

}
