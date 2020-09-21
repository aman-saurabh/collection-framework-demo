package com.techpassel.list;

import java.util.*;

public class NavigableMapDemo {
    public static void main(String[] args) {
        //TreeMap is implementation class of NavigableMap interface
        NavigableMap<String,String> nm = new TreeMap(new NavComparator());
        nm.put("Name","Aman");
        nm.put("Role","SDE2");
        nm.put("Location","Noida");
        nm.put("Project","Wemlo");
        nm.put("Technology","Java");
        nm.put("Performance","Good");
        System.out.println(nm);

        System.out.println(nm.floorKey("Project"));
        System.out.println(nm.lowerKey("Project"));
        System.out.println(nm.ceilingKey("Project"));
        System.out.println(nm.higherKey("Project"));
        System.out.println(nm.floorEntry("Project"));
        System.out.println(nm.lowerEntry("Project"));
        System.out.println(nm.ceilingEntry("Project"));
        System.out.println(nm.higherEntry("Project"));

        //Returns NavigableMap in reverse order
        NavigableMap<String, String > n = nm.descendingMap();
        System.out.println(n);

        //Methods defined in SortedSet, not specific to NavigableSet
        SortedMap<String,String> n1 = nm.headMap("Project");
        System.out.println(n1);
        SortedMap<String, String> n2 = nm.tailMap("Project");
        System.out.println(n2);

        //pollFirstKey() and pollLastKey() methods doesn't exist.Use pollFirstEntry() and pollLastEntry() methods
        //These methods removes and return first and last entry respectively.
        Map.Entry e1 = nm.pollFirstEntry();
        System.out.println(e1.getKey()+" --- "+ e1.getValue());
        Map.Entry e2 = nm.pollLastEntry();
        System.out.println(e2.getKey()+" --- "+ e2.getValue());

        System.out.println(nm);
    }
}

class NavComparator implements Comparator{
    @Override
    public int compare(Object o, Object t1) {
        String s1 = (String) o;
        String s2 = (String) t1;
        return s2.compareTo(s1);
    }
}