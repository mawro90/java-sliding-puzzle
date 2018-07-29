package sliding_puzzle;

public class Rules {
	boolean isMoveValid(Player player, Map matrix){
		if(player.x<0 || player.x>=matrix.getSize() || player.y<0 || player.y>=matrix.getSize()) {
			System.out.println("Move is not valid");
			return false;
		}
		else return true;
	}
}
