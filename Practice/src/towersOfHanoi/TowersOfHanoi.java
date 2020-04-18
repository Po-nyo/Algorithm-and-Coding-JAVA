package towersOfHanoi;

import java.util.Stack;

public class TowersOfHanoi {
	
	private Stack<Integer> first;
	private Stack<Integer> second;
	private Stack<Integer> third;
	private int disks;
	
	public TowersOfHanoi(int disks) {
		first = new Stack<Integer>();
		second = new Stack<Integer>();
		third = new Stack<Integer>();
		this.disks = disks;
		
		inIt();
	}
	
	public void solve() {
		System.out.print("Original State : ");
		printTowers();
		recursive(disks, this.first, this.second, this.third);
	}
	
	public void setDisks(int disks) {
		this.disks = disks;
		inIt();
	}
	
	private void recursive(int disks, Stack<Integer> first, Stack<Integer> second, Stack<Integer> third) {
		/*
		 * first = from : 출발지
		 * second = to 
		 * third = end : 목적지
		 */
		if(disks == 1) {
			third.push(first.pop());
			printTowers();
		}
		else {
			recursive(disks-1, first, third, second);
			third.push(first.pop());
			printTowers();
			recursive(disks-1, second, first, third);
		}
	}
	
	private void inIt() {
		for(int i=this.disks; i>0; i--)
			first.push(i);
		second.clear();
		third.clear();
	}
	
	public void printTowers() {
		System.out.println(first.toString()+" "+second.toString()+" "+third.toString());
	}
 
}
