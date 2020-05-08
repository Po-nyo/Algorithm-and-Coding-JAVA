package baekjoon_1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int count = 0;
		
		sc.nextLine();
		for(int i=0; i<testCase; i++) {
			String str = sc.nextLine();
			if(isGroup(str))
				count++;	
		}
		
		System.out.println(count);
		
		sc.close();
	}
	
	public static boolean isGroup(String str) {
		boolean[] alphabet = new boolean[26];
		
		char prev = str.charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(alphabet[c-'a'] && c != prev)
				return false;
			else if(!alphabet[c-'a']){
				alphabet[c-'a'] = true;
				prev = c;
			}	
		}
	
		return true;
	}

}
