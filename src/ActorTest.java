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
        SimpleActor actor = new SimpleActor("John", 6);
        TurnManager tm = new TurnManager();
        tm.add(actor);
    }
}
