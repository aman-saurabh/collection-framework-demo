package com.techpassel.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClassSortMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("Aman");
        a.add("Geetika");
        a.add("Samir");
        a.add("Shantanu");
        a.add("Manish");
        a.add("Aashish");
        System.out.println(a);
        //To sort a list it must not contain null values.
        //For default natural sorting order.
        Collections.sort(a);
        System.out.println(a);
        //For customized sorting order.
        Comparator c= new ListComparator();
        Collections.sort(a,c);
        System.out.println(a);
    }
}

class ListComparator implements Comparator{
    @Override
    public int compare(Object o, Object t1) {
        String s1 = (String) o;
        String s2 = (String) t1;
        return -s1.compareTo(s2);
    }
}