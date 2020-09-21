package com.techpassel.list;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysClassSortMethodDemo {
    public static void main(String[] args) {
        ArraysClassSortMethodDemo aObj = new ArraysClassSortMethodDemo();
        int[] ai = {1,62,39,16,21};
        System.out.println("Primitive array before sorting : ");
        for (int i=0; i<ai.length; i++){
            System.out.println(ai[i]);
        }
        Arrays.sort(ai);
        System.out.println("Primitive array after sorting : ");
        for (int i : ai){
            System.out.println(i);
        }

        String[] s = {"Aman","Geetika","Samir","Manish","Pawan"};
        System.out.println("Object Array before sorting");
        aObj.displayArrayObjects(s);
        System.out.println("Object Array after sorting using default natural sorting order : ");
        Arrays.sort(s);
        aObj.displayArrayObjects(s);
        Comparator c = (o1, o2) -> {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return  -s1.compareTo(s2);
        };
        System.out.println("Object Array after sorting using customized sorting order : ");
        Arrays.sort(s,c);
        aObj.displayArrayObjects(s);
    }

    public void displayArrayObjects(String[] s){
        for (String s1: s){
            System.out.println(s1);
        }
    }
}
