package collection;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(123);
        myList.add(4);
        myList.add(56);
/*
        System.out.println(myList.size());
        System.out.println(myList.get(0));

        System.out.println(myList.remove(1)); //usuwanie


      *//*  myList.clear();*//*

        System.out.println(myList.size());


        for (int i = 0; i<myList.size(); i++) {
            System.out.println(i + "-" + myList.get(i));
        }


        while (iterator.hasNext()) {
            if (iterator.next() == 4) {
                iterator.remove();
            }
        }

        for (Integer i : myList) {
            System.out.println(i);
        }*/

        Iterator<Integer> iterator = myList.iterator();


        ListIterator<Integer> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex() + " " + listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println(index + " " + value);

        }

        Integer[] arr = new Integer[myList.size()];
        arr = myList.toArray(arr);

        System.out.println("...........");
        System.out.println(arr[0]);





    }

}
