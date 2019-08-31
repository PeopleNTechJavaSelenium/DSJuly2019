package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        String state2 = "NJ";
        list.add("NY");
        list.add(state2);
        list.add("FL");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        list.remove(state2);
        System.out.println("After removing one node");
        Iterator it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
