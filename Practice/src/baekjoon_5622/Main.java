package baekjoon_5622;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
		int time = 0;
		
		for(int i=0; i<str.length(); i++) {
			
            if(str.charAt(i)-'0' == 1)
                time += 2;
            else if(str.charAt(i)-'0' == 0)
                time += 11;
            else {
			    time += arr[str.charAt(i)-'A'];
            }
		}
		
		System.out.println(time);
		
		sc.close();
	}
}