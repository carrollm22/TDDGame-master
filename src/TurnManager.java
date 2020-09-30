import java.util.HashMap;
import java.util.Map;

// this is a test for version control
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

    public void remove(SimpleActor actor) {
        map.remove(actor);
    }

    public void nextTurn() {
//        for(Map.Entry<Actor, Integer> set : this.map.entrySet()) {
//            boolean overHundred = false;
//            while(overHundred = false) {
//                if()  // last item in the HashMap is < 100
//                    for() // loop through HashMap and add speed to turn turn = turn + speed
//                else() //overHundred = true;
//            }
//            if()//check to see if the highest HashMap turn is the same as any below it, if they are compare speeds
//            //BODY whichever has the highest speed you take 100 off its turn and then return the actor
//            else()
//                    // take 100 of the hightest and return that actor
//
//        }
//    }
}
