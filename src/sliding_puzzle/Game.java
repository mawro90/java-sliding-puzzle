package sliding_puzzle;

import java.io.IOException;


public class Game{
	void run(Player player, Map matrix, Rules rules) throws IOException {
		while(true){
			player.Play(matrix,rules);
			player.movePuzzle(matrix);
			matrix.printMap();
			if(rules.isFinished(matrix)) break;
		}
		System.out.println("Congratulations. You're the winner");
	}

}
