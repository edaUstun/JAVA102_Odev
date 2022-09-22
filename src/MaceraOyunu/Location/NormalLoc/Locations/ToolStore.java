package MaceraOyunu.Location.NormalLoc.Locations;

import MaceraOyunu.Location.NormalLoc.NormalLoc;
import MaceraOyunu.Player;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "k");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Magaraya Hosgeldiniz.");
        return true;
    }

    public void menu() {

    }

    public void buy() {

    }
}
