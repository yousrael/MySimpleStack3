import dcll.etud.tp2.Item;
import dcll.etud.tp2.SimpleStackImpl;

import static org.junit.Assert.*;

/**
 * Created by HP on 10/04/2016.
 */
public class SimpleStackImplTest {

    SimpleStackImpl stack=new SimpleStackImpl();


    @org.junit.Test
    public void testIsEmpty() throws Exception {
        assertTrue(stack.isEmpty());

    }

    @org.junit.Test
    public void testGetSize() throws Exception {

        assertEquals(0,stack.getSize());

    }

    @org.junit.Test
    public void testPush() throws Exception {
    }

    @org.junit.Test
    public void testPeek() throws Exception {
          assertEquals(null,stack.peek());
    }

    @org.junit.Test
    public void testPop() throws Exception {
        assertEquals(null,stack.pop());

    }
}