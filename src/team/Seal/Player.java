package team.Seal;

public class Player {

    private String Name;
    private int points;

    public Player(String name){

        this.Name = Name;
        this.points = 0;
    }

    public String getName() {
        return Name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
