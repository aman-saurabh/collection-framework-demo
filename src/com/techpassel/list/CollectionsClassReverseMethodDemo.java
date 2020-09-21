package com.techpassel.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassReverseMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("Aman");
        a.add("Geetika");
        a.add("Samir");
        a.add("Shantanu");
        a.add("Manish");
        a.add("Aashish");
        System.out.println(a);
        //For reverse operation sorting is not mandatory.
        Collections.reverse(a);
        System.out.println(a);

        //Whereas Collections class reverseOrder() method is used to get the reversed Comparator for any Comparator.
        Comparator c = (o1, o2) -> {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.compareTo(s2);
        };
        Comparator c1 = Collections.reverseOrder(c);
        //Here since "c" is Comparator for alphabetical order then c1 will be Comparator for reversed alphabetical order.'
    }
}
