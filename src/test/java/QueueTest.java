import StackQueue.MyQueue;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by borisgrunwald on 27/09/2016.
 */
public class QueueTest {

    MyQueue<String> q = new MyArrayList<String>();

    @Before
    public void setUp() throws Exception {

        q.add("1");
        q.add("2");
        q.add("3");
        q.add("4");
        q.add("5");
        q.add("6");

    }

    @Test
    public void remove() throws Exception {

        q.remove();
        q.remove();

        assertEquals("4", q.peek());

    }

    @Test
    public void isEmpty() throws Exception {

        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();

        assertEquals(0, q.size());
        assertEquals(true, q.isEmpty());


    }

    @Test
    public void peek() throws Exception {

    }

}