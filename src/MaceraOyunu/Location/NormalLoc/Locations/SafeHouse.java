package MaceraOyunu.Location.NormalLoc.Locations;

import MaceraOyunu.Location.NormalLoc.NormalLoc;
import MaceraOyunu.Player;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Guvenli ev bolgesi");
        System.out.println("Caniniz yenilendi.");
        return true;
    }
}
