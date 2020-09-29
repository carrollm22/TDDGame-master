import java.util.HashMap;

public class TurnManager {
    HashMap<Actor, Integer> map = new HashMap<Actor, Integer>();
    public TurnManager() {
        HashMap<Actor, Integer> map = new HashMap<Actor, Integer>();

    }

    public void add(SimpleActor actor) {
        if(actor.getSpeed() > 0) {
        map.put(actor, 0);
        }
        else {
            throw new RuntimeException();
        }
    }
}
