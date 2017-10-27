package team.Seal;

public class Dice {


    /**Green Die*/
    String[] green = new String[] {"Brain","Brain","Brain","Run","Run","Shot"};
    /**Yellow Die*/
    String[] yellow = new String[] {"Brain","Brain","Run","Run","Shot","Shot"};
    /**Red Die*/
    String[] red = new String[] {"Brain","Run","Run","Shot","Shot","Shot"};

    /**String[] values - Array for the differnet faces of the dice*/



    private String[] values;


    private Dice(String[] values) {
        this.values = values;
    }

    public String[] getValues() {
        return values;
    }


}

