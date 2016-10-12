/**
 * Created by borisgrunwald on 14/09/2016.
 */
public class MyArrayClient {

    public static void main(String[] args) {


        MyArrayList<String> list = new MyArrayList<String>();


        list.add("suchwow");
        list.add("nice");
        list.add("heheh");
        list.add("lol");
        list.add("wow");
        list.add("lol");
        list.add("fsefse");
        list.add("suchwow");
        list.add("nice");
        list.add("heheh");
        list.add("heheh");


        list.remove(6);
        list.remove(5);
        list.remove(4);



        System.out.println(list);


    }


}
