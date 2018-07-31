package sliding_puzzle;

import java.util.Scanner;

public class Player {
	int x, y;
	Scanner move;
	
	Player(Map map){
		x=map.getZeroX();
		y=map.getZeroY();
		move=new Scanner(System.in);
	}
	
	void Play(Map map, Rules rules) {
		System.out.print("Move puzzle (a)left/(d)right/(w)up/(s)down and type enter:");
		String choice=move.next();
		switch(choice.toString()) {
			case "d":
				x=map.getZeroX();
				y=map.getZeroY()-1;
				if(!rules.isMoveValid(this, map)) {
					y=map.getZeroY();
				};
				break;
			case "a":
				x=map.getZeroX();
				y=map.getZeroY()+1;
				if(!rules.isMoveValid(this, map)) {
					y=map.getZeroY();
				};
				break;
			case "s":
				x=map.getZeroX()-1;
				y=map.getZeroY();
				if(!rules.isMoveValid(this, map)) {
					x=map.getZeroX();
				};
				break;
			case "w":
				x=map.getZeroX()+1;
				y=map.getZeroY();
				if(!rules.isMoveValid(this, map)) {
					x=map.getZeroX();
				};
				break;
			default:
				System.out.println("Unexpected move");
		}
	}
	Map movePuzzle(Map map) {
		map.setElement(map.getZeroX(), map.getZeroY(), map.getElement(x, y));
		map.setElement(x, y, 0);
		map.setZero(x, y);
		return map;
	}
}
