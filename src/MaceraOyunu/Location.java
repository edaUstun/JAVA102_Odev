package MaceraOyunu;

public abstract class Location {

    private Player player;
    private String name;


    public void Location() {}
    public void Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }


    public Player getPlayer() {
        return this.player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    public String name(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public abstract boolean onLocation();


}
