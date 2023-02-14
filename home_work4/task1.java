package home_work4;

import java.util.LinkedList;

/*
 * 1. Пусть дан LinkedList с несколькими элементами. 
 *    Реализуйте метод, который вернет “перевернутый” список.
 */

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> linkedli = new LinkedList<String>();

        linkedli.add("1");
        linkedli.add("2");
        linkedli.add("3");

        System.out.print("До реверса: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\n После реверса: " + linkedli);

    }


    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist){
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}