package baekjoon_2869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		/* 하루에 (a-b)미터씩 총 v미터를 올라감 	*/
		/* 정상에 도달한 날은 미끄러지지 않으므로 	*/
		/* (v-b)미터를 올라가는 것과 같음		*/
		int days = (v-b)/(a-b);
		
		if((v-b)%(a-b)!=0)	/* v-b가 a-b로 나누어 떨어지지 않는다면 	*/
			days++;			/* 올라갈 길이가 남아 있으므로 하루 추가	*/
		
		System.out.println(days);
		
		sc.close();
	}
}