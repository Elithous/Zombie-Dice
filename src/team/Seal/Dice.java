package team.Seal;

import java.util.Random;

public class Dice {


    /**Green Die*/
    String[] green = new String[] {"Brain","Brain","Brain","Run","Run","Shot"};
    /**Yellow Die*/
    String[] yellow = new String[] {"Brain","Brain","Run","Run","Shot","Shot"};
    /**Red Die*/
    String[] red = new String[] {"Brain","Run","Run","Shot","Shot","Shot"};

    /**String[] values - Array for the different faces of the die*/
    private String color;

    public Dice(String color) {
    	this.color = color;
    }

    public String roll() {
    	Random rand = new Random();
    	String value = "";
    	switch(color) {
    	case "green":
    		value = green[rand.nextInt(6)];
    		break;
    	case "red":
    		value = red[rand.nextInt(6)];
    		break;
    	case "yellow":
    		value = yellow[rand.nextInt(6)];
    	}
    	return value;
    }

}

