package javaCollectionFramework;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //List or collection -> Interface
    
        //ArrayList -> concrete class
        // List <Integer> list = new ArrayList<>();
        // Collection <Integer> collection = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
    
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);

        //addAll and removeAll
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        //size of list
        System.out.println(list.size());

        //clear
        System.out.println("Printing list2: " + list2);
        System.out.println("Size of list2: " + list2.size());
        list2.clear();
        System.out.println("Printing list2 after clearing: " + list2);
        System.out.println("Size of list2 after clearing: " + list2.size());

        //traverse using iterator
        Iterator<Integer> iterator = list.iterator();
        
    }
}
