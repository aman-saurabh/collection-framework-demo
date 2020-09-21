package com.techpassel.list;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithStringBufferComplex {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator2());
        t.add("Aman");
        t.add(new StringBuffer("Saurabh"));
        t.add("Samir");
        t.add(new StringBuffer("Mak"));
        t.add("Geetika");
        System.out.println(t);
    }
}

class MyComparator2 implements Comparator {
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 < l2)
            return -1;
        else if (l1 > l2)
            return 1;
        else return s1.compareTo(s2);
    }
}
