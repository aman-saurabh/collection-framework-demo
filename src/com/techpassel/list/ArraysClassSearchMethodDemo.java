package com.techpassel.list;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysClassSearchMethodDemo {
    public static void main(String[] args) {
        int[] i = {1, 32 ,21, 16, 9};
        System.out.println("For primitive array");
        Arrays.sort(i);
        for (int i1: i)
            System.out.println(i1);
        System.out.println(Arrays.binarySearch(i, 16));
        System.out.println(Arrays.binarySearch(i, 19));

        String[] s = {"Aman","Geetika","Samir","Manish","Pawan"};
        System.out.println("For sorted objects array using default natiral sorting order");
        Arrays.sort(s);
        for (String s1: s)
            System.out.println(s1);
        //If the array contains the element then it will return the "index" of the element.
        System.out.println(Arrays.binarySearch(s, "Samir"));
        //If the array does not contain the element then it will return the "insertion point" of element i.e the position where the element can be inserted
        //Insertion point is -1 based i.e insertion point -1 means index 0 i.e if you add element, then it will be inserted at index 0.Similarly insertion point -2 means index 1 and insertion point -3 means index 2 and so on.
        System.out.println(Arrays.binarySearch(s, "Jyoti"));

        System.out.println("For sorted objects array using default natural sorting order");
        Comparator c =(o1, o2) -> {
          String s1 = (String) o1;
          String s2 = (String) o2;
          return -s1.compareTo(s2);
        };
        Arrays.sort(s, c);
        for (String s1: s)
            System.out.println(s1);
        System.out.println(Arrays.binarySearch(s, "Samir",c));
        System.out.println(Arrays.binarySearch(s, "Jyoti",c));
    }
}
