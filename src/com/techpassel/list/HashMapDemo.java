package com.techpassel.list;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //Insertion order is not preserved in HashMap i.e object will not be stored in the same order in which they were inserted.
        HashMap<Integer, Object> h = new HashMap();

        //Insertion order is preserved in HashMap i.e object will be stored in the same order in which they were inserted.
        //LinkedHashMap<Integer, Object> h = new LinkedHashMap<>();

        /*
         * IdentityHashMap is same as HashMap the only difference in between them is as follows
         * IdentityHashMap is based Reference comparison while HashMap is based on Content comparison i.e IdentityHashMap uses "=="(i.e checks reference and not value) to identify duplicate values whereas HashMap uses equals() method(i.e checks content or value and not reference).
         * Suppose [String t1="Aman"] and [String t2="Aman"] are two variables which has same value but different reference.Hence in case of HashMap it will be considered as duplicate as HashMap check its content(i.e value) whereas in case of IdentityHashMap it won't be considered as duplicate as IdentityHashMap checks its reference.
         * Hence in IdentityHashMap you can create different keys with t1 and t2 both whereas in case of HashMap if you try for this then only one key will be inserted and later will only override previous value.
         */
        //IdentityHashMap<Integer, Object> h = new IdentityHashMap<>();

        h.put(1, "Aman");
        h.put(6, "Geetika");
        h.put(9, 10000);
        h.put(4, 6095);
        h.put(5, true);
        //It will replace value return old value as key 5 already exists.
        System.out.println(h.put(5, "Mohan"));
        //It will add new key-value pair and returns 0 as key 7 doesn't exist yet.
        System.out.println(h.put(7, 5500));

        System.out.println(h);

        System.out.println("All keys in the form of Set : ");
        Set s =  h.keySet();
        System.out.println(s);

        System.out.println("All values in the form of Collection : ");
        Collection c = h.values();
        //To print the Map object.
        System.out.println(c);

        System.out.println("All entries in the form of Set : ");
        Set l = h.entrySet();
        //To get key and value of every Entry object one by one.
        Iterator i = l.iterator();
        while (i.hasNext()){
            Map.Entry p = (Map.Entry) i.next();
            System.out.println(p.getKey() + " --- "+p.getValue());
            if(p.getValue().equals(6095)){
                p.setValue("Sikha");
            }
        }
        System.out.println(h);
    }
}
