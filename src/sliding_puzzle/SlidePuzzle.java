package sliding_puzzle;

import java.io.IOException;

public class SlidePuzzle {

	public static void main(String[] args) throws IOException {
		Map map=new Map();
		Player player = new Player(map);
		Rules rules = new Rules();
		Game game = new Game();
		game.run(player, map, rules);
	}

}
