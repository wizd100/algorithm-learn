package practice.test;

import java.util.LinkedList;

//https://coding-factory.tistory.com/552
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //list.removeLast();
        list.pollLast();

        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(4);
        list.addLast(5);
        list.add(2, 6);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*for (int i  : list) {
            System.out.println(i);
        }*/

        System.out.println("---");

        list.removeFirst();
        list.removeLast();
        list.remove(1);
        //list.clear();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
