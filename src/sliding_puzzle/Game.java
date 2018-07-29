package sliding_puzzle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game{
	void run(Player player, Map matrix, Rules rules) throws IOException {
		while(true){
			player.Play(matrix,rules);
			player.movePuzzle(matrix);
			matrix.printMap();
		}
	}

}
