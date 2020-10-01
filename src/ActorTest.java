import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {

    @Test
    public void nothing(){
    }

    @Test
    public void canCreateActor(){
        SimpleActor actor = new SimpleActor("Joe", 2);
        assertEquals("Joe", actor.getName());
        assertEquals(2, actor.getSpeed());
    }

    @Test
    public void canCreateSecondActor(){
        SimpleActor actor = new SimpleActor("Sam", 3);
        assertEquals("Sam", actor.getName());
        assertEquals(3, actor.getSpeed());
    }

    @Test
    public void createTurnManager() {
        TurnManager tm = new TurnManager();
    }

    @Test
    public void canAddActor() {
        SimpleActor actor = new SimpleActor("John", 7);
        TurnManager tm = new TurnManager();
        tm.add(actor);
    }

    @Test
    public void canRemoveActor(){
        SimpleActor actor = new SimpleActor("Henry", 7);
        SimpleActor actor2 = new SimpleActor("Red", 10);
        TurnManager tm = new TurnManager();
        tm.add(actor);
        tm.add(actor2);
        tm.remove(actor);
        assertEquals(tm.actorTurns.size(), 1);
    }

    @Test
    public void nextTurnWithOneActor() {
        SimpleActor actor = new SimpleActor("Larry", 8);
        TurnManager tm = new TurnManager();
        tm.add(actor);
        assertEquals(tm.nextTurn(), actor);
    }

    @Test
    public void nextTurnWithTwoActors() {
        SimpleActor a1 = new SimpleActor("Larry", 2);
        SimpleActor a2 = new SimpleActor("Jerry", 1);

        TurnManager tm = new TurnManager();
        tm.add(a1);
        tm.add(a2);
        assertEquals(tm.nextTurn(), a1);
    }

    @Test
    public void print() {
        SimpleActor a1 = new SimpleActor("Larry", 2);
        SimpleActor a2 = new SimpleActor("John", 1);

        TurnManager tm = new TurnManager();
        tm.add(a1);
        tm.add(a2);
        tm.nextTurn();

        tm.printTurnMeters();
    }
}
