package MaceraOyunu.Location.NormalLoc;

import MaceraOyunu.Location.Location;
import MaceraOyunu.Player;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    public abstract boolean onLocation();

}
