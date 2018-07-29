package sliding_puzzle;

import java.util.ArrayList;


public class Map {
	private int [][] matrix;
	private int size = 4;
	private int x_zero;
	private int y_zero;
	Map(){
		this.matrix=new int[size][size];
		this.matrix=generate();
		printMap();

	}
	int[][] generate(){
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		for (int i = 0; i<16; i++) {
			numbers.add(i);
		}
		matrix=putNumbers(numbers);
		return matrix;
	}
	int[][] putNumbers(ArrayList n){
		int lottery;
		int range = n.size();
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				lottery=(int) (Math.random()*range);
				matrix[i][j]=(int) n.get(lottery);
				if (matrix[i][j]==0) {
					x_zero = i;
					y_zero = j;
				}
				n.remove(lottery);
				range--;
			}
		}
		return matrix;
	}
	void printMap() {
		for(int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if(matrix[i][j]==0) System.out.print("|  ");
				else if(matrix[i][j]<10) System.out.print("| "+matrix[i][j]);
				else System.out.print("|"+matrix[i][j]);
				
			}
			System.out.println();
		}
		
	}
	int getElement(int x, int y) {
		return matrix[x][y];
	}
	void setElement(int x, int y, int value) {
		matrix[x][y]=value;
	}
	int getSize() {
		return size;
	}
	
	int getZeroX() {
		return x_zero;
	}
	int getZeroY() {
		return y_zero;
	}
	void setZero(int x, int y) {
		x_zero = x;
		y_zero = y;
	}
	
}

//losujemy index z zakresu [1,2,3,4,6,7,8,9]