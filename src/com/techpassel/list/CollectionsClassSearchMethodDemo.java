package com.techpassel.list;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsClassSearchMethodDemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("S");
        l.add("M");
        //We can insert duplicate values but not null if we want to perform sort or search operation.
        l.add("S");
        l.add("O");
        //To perform search operation,compulsory we must sort the list first.
        //For List sorted using default natural sorting order.
        Collections.sort(l);
        System.out.println(l);
        //If the list contains the element then it will return the "index" of the element.
        int p1 = Collections.binarySearch(l,"M");
        System.out.println("Position of M in list sorted using D.N.S.O. : "+p1);
        //If the list does not contain the element then it will return the "insertion point" of element i.e the position where the element can be inserted
        //Insertion point is -1 based i.e insertion point -1 means index 0 i.e if you add element, then it will be inserted at index 0.Similarly insertion point -2 means index 1 and insertion point -3 means index 2 and so on.
        int p2 = Collections.binarySearch(l,"P");
        System.out.println("Position of P in list sorted using D.N.S.O. : "+p2);

        //For List sorted using default natural sorting order.
        //ListComparator defined in CollectionsClassSortMethodDemo file.
        ListComparator c =new ListComparator();
        Collections.sort(l,c);
        System.out.println(l);
        int p3 = Collections.binarySearch(l,"S",c);
        System.out.println("Position of S in list sorted using customized sorting order : "+p3);
        //If element is present in two or more places then it will return the index of first occurrence.
        int p4 = Collections.binarySearch(l,"Z",c);
        System.out.println("Position of Z in list sorted using customized sorting order : "+p4);
    }
}
