import org.junit.Before;
import org.junit.Test;
import Exception.MyArrayOutOfBoundsException;

import static org.junit.Assert.*;

/**
 * Created by ${Boris} Grunwald} on 15/11/2016.
 */
public class MyArrayListTest {

    MyArrayList<String> list = new MyArrayList<String>();

    @Before
    public void setUp() throws Exception {

        list.add("Word1");
        list.add("Word2");
        list.add("Word3");
        list.add("Word4");
        list.add("Word5");
        list.add("Word6");

    }




    @Test
    public void indexOf() throws Exception {

        assertEquals(2,list.indexOf("Word3"));
        assertEquals(5,list.indexOf("Word6"));
        assertEquals(0,list.indexOf("Word1"));

    }

    @Test
    public void contains() throws Exception {

        assertEquals(true,list.contains("Word6"));
        assertEquals(true,list.contains("Word2"));
        assertEquals(false,list.contains("Word7"));

    }

    @Test
    public void removeAtIndex() throws Exception {

        list.remove(2);
        assertEquals(5,list.size());
        assertEquals("Word4",list.get(2));

    }

    @Test
    public void add() throws Exception {

        list.add("Word7");
        list.add("Word8");

        assertEquals("Word7",list.get(6));
        assertEquals("Word8",list.get(7));

    }

    @Test
    public void addAtIndex() throws Exception {

        list.add("Word0", 0);
        list.add("Word -1",0);

        assertEquals("Word0", list.get(1));
        assertEquals("Word -1", list.get(0));


    }

    @Test
    public void get() throws Exception {

        assertEquals("Word3", list.get(2));
        assertEquals("Word1", list.get(0));
        assertEquals("Word6", list.get(5));

    }

    @Test
    public void set() throws Exception {

        list.set("Word -1",0);
        list.set("test",5);

        assertEquals("Word -1", list.get(0));
        assertEquals("test", list.get(5));

    }

    @Test
    public void size() throws Exception {

        assertEquals(6,list.size());
        list.add("word");
        assertEquals(7,list.size());
        list.remove();
        list.remove();
        assertEquals(5,list.size());

    }

    @Test
    public void clear() throws Exception {

        assertEquals(6,list.size());
        list.clear();
        assertEquals(0,list.size());

    }

    @Test
    public void removeLastAdded() throws Exception {

        list.remove();
        list.remove();

        assertEquals("Word4",list.get(list.size()-1));
        assertEquals(4,list.size());

    }

    @Test
    public void isEmpty() throws Exception {

        assertEquals(false,list.isEmpty());
        list.clear();
        assertEquals(true,list.isEmpty());

    }

    @Test
    public void peek() throws Exception {

    }

    @Test(expected = MyArrayOutOfBoundsException.class)
    public void testException() throws Exception {
        list.get(10);
        list.set("word7",8);
    }


}