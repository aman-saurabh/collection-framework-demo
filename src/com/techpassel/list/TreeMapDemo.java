package com.techpassel.list;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        LinkedHashMap l = new LinkedHashMap();
        l.put("Aman", "CTO");
        l.put("Samir", "Account Manager");
        l.put("Geetika", "Team Leader");
        l.put("Swati", "Networking Team Lead");
        l.put("Manish", "Trainer");
        TreeMap t1 = new TreeMap();
        t1.put("Ashish", "Motivational Speaker");
        t1.putAll(l);

        System.out.println(t1);

        System.out.println(t1.firstKey());
        System.out.println(t1.lastKey());
        System.out.println(t1.firstEntry().getValue());
        System.out.println(t1.size());

        TreeMap t2 = new TreeMap(new MapComparator());
        t2.put("Ashish", "Motivational Speaker");
        t2.putAll(l);
        System.out.println(t2);
    }
}

class MapComparator implements Comparator {
    public int compare(Object o1, Object o2){
        String s1 = o1.toString();
        String s2 = o2.toString();
        //To store data in reverse alphabetical order.
        return s2.compareTo(s1);
    }
}