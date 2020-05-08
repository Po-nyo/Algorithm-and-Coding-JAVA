package baekjoon_4673;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> selfNumber = new ArrayList<>();
		findSelfNumber(selfNumber, 10000);
		
		for(int i : selfNumber)
			System.out.println(i);
	}

	public static void findSelfNumber(ArrayList<Integer> list, int max) {
		int[] arr = new int[max+1];
		int num;
		int result;
		
		for(int i=1; i<=max; i++) {
			result = 0;
			num = i;
			result += num;
			
			while(num>0) {
				result += num%10;
				num /= 10;
			}
			
			if(result <= max)
				arr[result]++;
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == 0)
				list.add(i);
		}
	}
	
}
