package com.techpassel.list;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> t =new TreeSet(new MyComparator1());
        t.add("Aman");
        t.add("Pawan");
        t.add("Suman");
        t.add("Naman");
        t.add("Subham");
        System.out.println(t);
    }
}

class MyComparator1 implements Comparator {
    //To store names in reverse alphabetical order.
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return - s1.compareTo(s2);
        //or
        //return s2.compareTo(s1);
    }
}