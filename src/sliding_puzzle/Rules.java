package sliding_puzzle;

public class Rules {
	boolean isMoveValid(Player player, Map matrix){
		if(player.x<0 || player.x>=matrix.getSize() || player.y<0 || player.y>=matrix.getSize()) {
			System.out.println("Move is not valid");
			return false;
		}
		else return true;
	}
	boolean isFinished(Map matrix){
		int counter=1;
		for(int i=0; i<matrix.getSize(); i++) {
			for(int j=0; j<matrix.getSize(); j++) {
				if (counter == 16) counter=0;
				if(matrix.getElement(i, j)==counter) {
					counter++;
				}
				else return false;
			}
		}
		return true;
	}
}
