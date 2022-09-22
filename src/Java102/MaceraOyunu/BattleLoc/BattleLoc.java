package Java102.MaceraOyunu.BattleLoc;


import Java102.MaceraOyunu.Location;
import Java102.MaceraOyunu.Obstacle.Obstacle;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public BattleLoc(Obstacle obstacle) {
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
