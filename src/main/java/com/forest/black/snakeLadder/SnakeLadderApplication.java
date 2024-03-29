package com.forest.black.snakeLadder;

import com.forest.black.snakeLadder.model.Game;
import com.forest.black.snakeLadder.model.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SnakeLadderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnakeLadderApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter board Size");
		int boardSize = scanner.nextInt();
		System.out.println("Enter number of players");
		int numberOfPlayers = scanner.nextInt();
		System.out.println("Enter number of snakes");
		int numSnakes = scanner.nextInt();
		System.out.println("Enter number of ladders");
		int numLadders = scanner.nextInt();

		Game game = new Game(numLadders, numSnakes, boardSize);
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Enter player name");
			String pName = scanner.next();
			Player player = new Player(pName);
			game.addPlayer(player);
		}
		game.playGame();
	}

}
