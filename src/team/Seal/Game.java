package team.Seal;

import java.util.Scanner;

public class Game {
	private static Scanner scan = new Scanner(System.in);
	private static Player player1, player2;
	private static Cup cup;

	public static String getInput(String prompt) {
		System.out.print(prompt + ": ");
		return scan.nextLine();
	}

	public static String getInput() {
		return scan.nextLine();
	}

	public static void sleep(int mili) {
		try {
			Thread.sleep(mili);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sleep() {
		scan.nextLine();
	}

	private static void init() {
		String name1 = getInput("Player 1 enter your name");
		String name2 = getInput("Player 2 enter your name");
		player1 = new Player(name1);
		player2 = new Player(name2);
		cup = new Cup();

	}

	public static void run() {
		init();
		boolean won = false;
		while (!won) {
			won = turn(player1);
			if (won)
				System.out.println("Congrats " + player1.getName() + " you won!");
			else {
				won = turn(player2);
				if (won)
					System.out.println("Congrats " + player2.getName() + " you won!");
			}
		}

	}

	private static void newDice(Dice[] dice) {
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == null) {
				dice[i] = cup.getDice();
			}
		}
	}

	private static void rollDice(Dice[] dice, Player player) {
		for (int i = 0; i < dice.length; i++) {
			switch (dice[i].roll()) {
			case "Brain":
				System.out.println("The " + dice[i].getColor() + " die rolled a brain!");
				player.addBrains(1);
				dice[i] = null;
				sleep(700);
				break;
			case "Shot":
				System.out.println("The " + dice[i].getColor() + " die rolled a shot!");
				player.addShots(1);
				dice[i] = null;
				sleep(700);
				break;
			case "Run":
				System.out.println("The " + dice[i].getColor() + " die rolled a runner!");
				sleep(700);
				break;
			}
		}
	}

	private static boolean turn(Player player) {
		Dice[] dice = new Dice[3];
		boolean rollAgain = true;
		String input;
		System.out.println(player.getName() + " it is your turn. (press enter to continue)");
		System.out.println("Score: " + player.getPoints());
		sleep();
		while (rollAgain) {
			newDice(dice);
			System.out.println("The dice you are going to roll are " + dice[0].getColor() + ", " + dice[1].getColor()
					+ ", and " + dice[2].getColor());
			sleep(900);
			rollDice(dice, player);
			System.out.println(
					"Score: " + player.getPoints() + " Brains: " + player.getBrains() + " Shots: " + player.getShots());
			if (player.hasWon()) {
				return true;
			} else if (player.hasLost()) {
				System.out.println("The humans have overrun you. You must run and you lose all the brains you had!");
				break;
			}
			System.out.println("Would you like to roll again? (y or n)");
			input = getInput();
			if (input.equalsIgnoreCase("n"))
				rollAgain = false;
		}
		if (!rollAgain) {
			player.addPoints(player.getBrains());
		}
		player.setBrains(0);
		player.setShots(0);
		return false;
	}
}
