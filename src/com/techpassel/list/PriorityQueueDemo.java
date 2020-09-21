package com.techpassel.list;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        try {
            p.peek();
            //peek() and element() both are used to get data but if empty then peek() will return null while element() will throw runtime exception:NoSuchElementException.
            p.element();
        } catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        try {
            p.poll();
            //poll() and remove() both are used to remove data but if empty then poll() will return null while remove() will throw runtime exception:NoSuchElementException.
            p.remove();
        } catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        p.offer(1);
        p.offer(2);
        //Methods defined in Collection interface are also applicable for PriorityQueue.
        p.add(3);
        TreeSet<Integer> t= new TreeSet<>();
        for (int i =11; i<= 15; i++){
            t.add(i);
        }
        p.addAll(t);
        System.out.println(p);
        Iterator it = p.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        Comparator c = (o1, o2) -> {
          String s1 = (String) o1;
          String s2 = (String) o2;
          return -s1.compareTo(s2);
        };

        PriorityQueue<String> pc = new PriorityQueue(c);
        pc.offer("Aman");
        pc.offer("Samir");
        pc.offer("Ravi");
        pc.offer("Manish");
        pc.offer("Geetika");
        pc.offer("Swati");
        System.out.println(pc);
        /*
         * You will see data is not stored as you expected(i.e in reverse alphabetical order) actually in queue, order of entire data is not taken care, only the data on the head(i.e top) is guaranteed.
         * So when you fetch them using peek(), element() methods or remove them with poll() and remove() methods(which also returns data) you will find it is returning data in the order as you expected.
         * Actually PriorityQueue is implemented using binary min heaps, which are optimized for fast retrieval/removal of the smallest (highest priority) element.
         * While TreeSet is implemented using red-black trees, and can be quickly searched for a random element, but can't retrieve and remove the smallest element as fast.
         * And that's the reason why for any operation where data needs to be processed one by one there PriorityQueue is preferred over TreeSet.
         */
        int size = pc.size();
        for (int i =0; i< size; i++){
            System.out.println(pc.poll());
        }

        TreeSet<String> tt = new TreeSet();
        tt.add("Aman");
        tt.add("Samir");
        tt.add("Ravi");
        tt.add("Manish");
        tt.add("Geetika");
        tt.add("Swati");
        //In TreeSet you will find entire data is stored as you expected(i.e according to reverse alphabetical order.)
        System.out.println(tt);
    }
}