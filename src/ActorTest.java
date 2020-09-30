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
        assertEquals("Red", actor2.getName());
    }
}
