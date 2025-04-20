package ArrayListPratice;

import java.util.ArrayList;

public class arraylistDemo {
    public static void main (String [] args) {
        ArrayList<Integer> list = new ArrayList<>(); // make arraylist
        list.add(75); // add some value
        list.add(543);
        list.add(123);
        System.out.println(list.getClass()); //print array list class
        System.out.println(list); // print all values in arraylist
        System.out.println(list.size()); // print size of arraylist
        list.trimToSize();
        list.add(12);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("loop");
        for(int i = 0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }// print first value

    }
}

