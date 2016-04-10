import dcll.etud.tp2.Item;
import dcll.etud.tp2.SimpleStackImpl;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by HP on 10/04/2016.
 */
public class SimpleStackImplTest {

    SimpleStackImpl st;

    @Before
    public void setUp(){
        st=new SimpleStackImpl();
    }


    @org.junit.Test
    public void testIsEmpty() throws Exception {
        assertTrue(st.isEmpty());
        Item it=new Item();
        st.push(it);
        assertFalse(st.isEmpty());
    }

    @org.junit.Test
    public void testGetSize() throws Exception {
        assertEquals(0,st.getSize());
        Item it=new Item();
        st.push(it);
        assertEquals(1,st.getSize());
        //assertEquals(0,stack.getSize());

    }

    @org.junit.Test
    public void testPush() throws Exception {
        Item it1=new Item();
        Item it2=new Item();
        st.push(it1);
        st.push(it2);
        assertEquals(2,st.getSize());

    }

    @org.junit.Test
    public void testPeek() throws Exception {
        Item it1=new Item();
        Item it2=new Item();
        st.push(it1);
        st.push(it2);
        assertEquals(it2,st.peek());
          //assertEquals(null,stack.peek());
    }

    @org.junit.Test
    public void testPop() throws Exception {
        Item it1=new Item();
        Item it2=new Item();
        st.push(it1);
        st.push(it2);
        assertEquals(it2,st.pop());
        //assertEquals(null,stack.pop());

    }
}