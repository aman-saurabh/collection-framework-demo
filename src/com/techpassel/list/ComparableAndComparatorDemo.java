package com.techpassel.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableAndComparatorDemo {
    public static void main(String[] args) {
        //Created ArrayList just to reuse its elements in both TreeSets
        ArrayList<Employee> a = new ArrayList<>();
        a.add(new Employee(3,"Aman"));
        a.add(new Employee(2,"Geetika"));
        a.add(new Employee(9,"Samir"));
        a.add(new Employee(6,"Swati"));
        a.add(new Employee(1,"Manish"));

        System.out.println("TreeSet using default natural sorting order i.e Comparable interface");
        TreeSet<Employee> t1 = new TreeSet<>();
        t1.addAll(a);
        Iterator i1 = t1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        System.out.println("TreeSet using customized sorting order i.e Comparator interface");
        TreeSet<Employee> t2 = new TreeSet<>(new EmployeeComparator());
        t2.addAll(a);
        Iterator i2 = t2.iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }
    }
}

class Employee implements Comparable {
    int eid;
    String name;
    Employee(int eid, String name){
        this.eid = eid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[eid = "+this.eid+", name = "+this.name+"]";
    }

    @Override
    public int compareTo(Object o) {
        int id1 = this.eid;
        Employee e = (Employee) o;
        int id2 = e.eid;
        if(id1 < id2){
            return -1;
        } else if(id1 > id2){
            return +1;
        } else {
            return 0;
        }
    }
}

class EmployeeComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}