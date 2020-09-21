package com.techpassel.list;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p1 = new Properties();
        p1.setProperty("Name", "Aman");
        p1.setProperty("Post","SDE2");
        //We can use any kind of OutputStream or Writer classes to write data in properties file.
        FileOutputStream fos= new FileOutputStream("/home/aman/Desktop/abc.properties");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        p1.store(bos, "Set user details");

        Properties p2 = new Properties();
        //We can use any kind of InputStream or Reader classes to read data from properties file.
        FileReader fr = new FileReader("/home/aman/Desktop/abc.properties");
        BufferedReader br = new BufferedReader(fr);
        p2.load(br);
        Enumeration e = p2.propertyNames();
        while (e.hasMoreElements()){
            String propertyName = (String) e.nextElement();
            String s = p2.getProperty(propertyName);
            System.out.println(propertyName+" --- "+s);
        }
    }
}
