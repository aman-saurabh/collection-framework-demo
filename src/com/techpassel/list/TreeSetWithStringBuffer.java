package com.techpassel.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetWithStringBuffer {
    public static void main(String[] args) {
        HashSet<StringBuffer> h = new HashSet<>();
        h.add(new StringBuffer("Aman"));
        h.add(new StringBuffer("Pawan"));
        h.add(new StringBuffer("Sohan"));
        h.add(new StringBuffer("Mohan"));
        //in java 11 it will work fine but if you run this program in Java8 it will throw following error :
        //Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
        //It is because till java 10 StringBuffer class has not implemented Comparable interface hence default natural sorting order was not possible for StringBuffer.
        //Hence when you try to convert a HashSet of type StringBuffer into a TreeSet.It will try for defaults natural sorting order and thus throws error.
        TreeSet<StringBuffer> t = new TreeSet<>(h);
        Iterator i = t.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
