package team.Seal;

public class Player {

    private String Name;
    private int points;
    private int brains;
    private int shots;


    public Player(String name){

        this.Name = Name;
        this.points = 0;
        this.brains=0;


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

    private void setBrains(int brains){
        this.brains = brains;
    }
    public int getbrains(){
        return brains;
    }

    private void setShots(int shots){
        this.shots=shots;
    }

    public int getShots(){
        return shots;

    }
    public String winner(){
        if(this.brains == 13)
            return "you win";
        else {
            return "";
        }

    }
}
/* define a player.
public void play game
sout how many players
scanner to pick how many
put it into palyer array then use for loop
ask for name

 */