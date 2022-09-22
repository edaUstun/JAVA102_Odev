package MaceraOyunu.Location.BattleLoc;


import MaceraOyunu.Location.Location;
import MaceraOyunu.Obstacle.Obstacle;
import MaceraOyunu.Player;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public BattleLoc(Obstacle obstacle, Player player) {
        super(player, "D");
        this.obstacle = obstacle;
    }

    public Obstacle getObstacle() {
        return this.obstacle;
    }
    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }


    public void combat() {

    }

    @Override
    public boolean onLocation() {
        return true;
    };

}
