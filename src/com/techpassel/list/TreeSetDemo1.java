package com.techpassel.list;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        MyComparator m = new MyComparator();
        TreeSet<Integer> t = new TreeSet<>(m);
        t.add(53);
        t.add(37);
        t.add(8);
        t.add(85);
        t.add(29);
        System.out.println(t);
    }
}

class MyComparator implements Comparator {
    //To insert data in descending order
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if(i1 > i2)
            return -1;
        else if(i1 < i2)
            return +1;
        else
            return 0;
        //Same thing can also be achieved by the following code.Since Comparable interface is implemented by Integer class and we are comparing Integer data
        //Hence we can use its compareTo() method for default sorting order for integers which is increasing order.But since our requirement is decreasing order hence we use -ve.
        //return -i1.compareTo(i2);
        //or
        //return i2.compareTo(i1);
    }
}
