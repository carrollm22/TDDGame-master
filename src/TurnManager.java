
import java.util.*;

// this is a test for version control
public class TurnManager {
    final Map<Actor, Integer> actorTurns;

    public TurnManager() {
        actorTurns = new HashMap<Actor, Integer>();
    }

    public void add(SimpleActor actor) {
        if (actor.getSpeed() > 0) {
            actorTurns.put(actor, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public void remove(SimpleActor actor) {
        actorTurns.remove(actor);
    }

    public Actor nextTurn() {
        Actor nextActorForTurn = null;
        for (Actor actor : actorTurns.keySet()) {
            if (nextActorForTurn == null) {
                nextActorForTurn = actor;
            } else if (actorTurns.get(actor) > actorTurns.get(nextActorForTurn)) {
                nextActorForTurn = actor;
            }
        }
        if (actorTurns.get(nextActorForTurn) <= 100) {
            for (Actor actor : actorTurns.keySet()) {
                actorTurns.replace(actor, actorTurns.get(actor), actorTurns.get(actor) + actor.getSpeed());
            }
            return nextTurn();
        } else {
            int turnMeter = actorTurns.get(nextActorForTurn);
            actorTurns.replace(nextActorForTurn, turnMeter - 100);
            return nextActorForTurn;
        }
    }

    public void printTurnMeters() {
        List<Map.Entry<Actor, Integer>> entries = new ArrayList<>(actorTurns.entrySet());
        entries.sort(Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(entries);
        int longestName = 0;
        int longestTurnMeter = 0;
        for (Map.Entry<Actor, Integer> entry : entries) {
            if (entry.getKey().getName().length() > longestName) {
                longestName = entry.getKey().getName().length();
            }

            if (entry.getValue().toString().length() > longestTurnMeter) {
                longestTurnMeter = entry.getValue().toString().length();
            }
        }

        for (Map.Entry<Actor, Integer> entry : entries) {
            System.out.println(
                    String.format("%1$-" + longestName + "s", entry.getKey().getName())
                            + "\t"
                            + String.format("%1$" + longestTurnMeter + "s", entry.getValue().toString())
            );
        }
    }
}
