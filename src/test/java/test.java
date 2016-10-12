import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by borisgrunwald on 13/09/2016.
 */
public class test {

    @Test
    public void testInitSize() {

        MyArrayList<String> list = new MyArrayList<String>();

        assertEquals(0,list.size());

    }

    @Test
    public void testGet() {

        MyArrayList<String> list = new MyArrayList<String>();

        list.add("lol");
        list.add("nice");

        assertEquals("nice", list.get(1));
        assertEquals("lol", list.get(0));

    }

    @Test
    public void testAdd() {

        MyArrayList<String> list = new MyArrayList<String>();

        list.add("lol");
        list.add("nice");
        list.add("lol");
        list.add("nice");
        list.add("lol");
        list.add("nice");
        list.add("lol");
        list.add("nice");
        list.add("lol");
        list.add("nice");
        list.add("lol");
        list.add("nice");
        list.add("lol");
        list.add("nice");


        assertEquals("lol", list.get(0));
        assertEquals("nice", list.get(1));

     }

    @Test
    public void testAddMany() {

        MyArrayList<Integer> list = new MyArrayList<Integer>();

        for(int i = 0; i <= 100000; i++) {

            list.add(i);

        }

    }

    @Test
    public void testAddAtIndex() {

        MyArrayList<String> list = new MyArrayList<String>();

        list.add("lol");
        list.add("nice");
        list.add("hehe");
        list.add("wut");

        list.add("toast", 1);
        list.add("awesome", 2);


        assertEquals("toast", list.get(1));
        assertEquals("awesome", list.get(2));

    }

    @Test
    public void testRemove() {

        MyArrayList<String> list = new MyArrayList<String>();

        list.add("lol");
        list.add("hehe");
        list.add("nice");
        list.add("wut");


        list.remove(2);

        assertEquals(3,list.size());
        assertEquals("wut", list.get(2));


    }

    @Test
    public void testIndexOf() {

        MyArrayList<String> list = new MyArrayList<String>();

        list.add("lol");
        list.add("hehe");
        list.add("nice");
        list.add("wut");
        list.add("lolr");
        list.add("hedrgdhe");
        list.add("niddce");
        list.add("wrfeut");

        assertEquals(7, list.indexOf("wrfeut"));
        assertEquals(5, list.indexOf("hedrgdhe"));


    }

    @Test
    public void testToString() {

        MyArrayList<String> list = new MyArrayList<String>();

        list.add("lol");
        list.add("hehe");
        list.add("nice");
        list.add("wut");

        assertEquals("[lol, hehe, nice, wut]", list.toString());


    }

    @Test
    public void testClear() {

        MyArrayList<String> list = new MyArrayList<String>();

        list.add("lol");
        list.add("hehe");
        list.add("nice");
        list.add("wut");

        list.clear();

        assertEquals(0, list.size());



    }












}
