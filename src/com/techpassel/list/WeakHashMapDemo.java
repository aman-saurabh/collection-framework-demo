package com.techpassel.list;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        //HashMap<Temp, String> m = new HashMap();
        WeakHashMap<Temp, String> m = new WeakHashMap();
        Temp t = new Temp("Aman");
        m.put(t, "Developer");
        System.out.println(m);
        t= null;
        System.gc();
        Thread.sleep(1000);
        /*
         * In case of WeakHashMap it will print empty object {} while in case of HashMap it will print data as earlier.
         * Its because in WeakHasMap, even though we have assigned Temp object(t) to WeakHashMap as key but when we reassign its value(value of t) as null it become eligible to garbage collection and hence when we call Garbage collector, its destroys Temp Object after calling its finalize() method.
         * But in case of HashMap even though we have reassigned value of (t) as null but since Temp object is associated with HashMap hence garbage collector won't destroy it and it will be available in the HashMap even after calling Garbage collector.
         */
        System.out.println(m);
    }
}

class Temp {
    public String name;
    Temp(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    public void finalize(){
        System.out.println("Finalize method called.");
    }
}
