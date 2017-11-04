package team.Seal;

public class Main {

	public static void main(String[] args) {
		boolean playAgain;
		String input;
		do {
			Game.run();
			input = Game.getInput("Would you like to play again (y or n)");
			playAgain = input.equalsIgnoreCase("y");
		} while (playAgain);
	}

}
