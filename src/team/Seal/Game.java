package team.Seal;

import java.util.Scanner;

public class Game {
	private static Scanner scan = new Scanner(System.in);
	private static Player player1,player2;
	
	public static String getInput(String prompt) {
		System.out.print(prompt + ": ");
		return scan.nextLine();
	}
	
	private static void init() {
		String name1 = getInput("Player 1 enter your name");
		String name2 = getInput("Player 2 enter your name");
		player1 = new Player(name1);
		player2 = new Player(name2);
	}
	
	public static void run() {
		init();
	}
}
