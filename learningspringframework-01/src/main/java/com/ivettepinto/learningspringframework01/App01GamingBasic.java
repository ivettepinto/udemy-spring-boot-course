package com.ivettepinto.learningspringframework01;

import com.ivettepinto.learningspringframework01.game.GameRunner;
import com.ivettepinto.learningspringframework01.game.PacmanGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
