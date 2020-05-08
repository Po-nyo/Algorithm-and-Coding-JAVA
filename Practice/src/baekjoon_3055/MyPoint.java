package baekjoon_3055;

public class MyPoint {
	private int row; // 행
	private int col; // 열
	private char element; //해당위치의 상태 저장

	public MyPoint(int row, int col, char element) {
		this.row = row;
		this.col = col;
		this.element = element;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public char getElement() {
		return element;
	}

	public void setElement(char element) {
		this.element = element;
	}

}
