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
		System.out.print("Move puzzle (l)eft/(r)ight/(u)p/(d)own and type enter:");
		String choice=move.next();
		switch(choice.toString()) {
			case "l":
				x=map.getZeroX();
				y=map.getZeroY()-1;
				if(!rules.isMoveValid(this, map)) {
					y=map.getZeroY();
				};
				break;
			case "r":
				x=map.getZeroX();
				y=map.getZeroY()+1;
				if(!rules.isMoveValid(this, map)) {
					y=map.getZeroY();
				};
				break;
			case "u":
				x=map.getZeroX()-1;
				y=map.getZeroY();
				if(!rules.isMoveValid(this, map)) {
					x=map.getZeroX();
				};
				break;
			case "d":
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