package com.xworkz.crud.tester;

import java.util.ArrayList;
import java.util.Collection;

public class MobileTester {
    public static void main(String[] args) {
        Collection<String> collection=  new ArrayList<String>();

        collection.add("samsung");
        collection.add("apple");
        collection.add("vivo");
        collection.add("oppo");
        collection.add("sony");

        System.out.println(collection);
        collection.remove("oppo");

        System.out.println(collection);
        System.out.println("Size is:"+collection.size());

        System.out.println("Checking for value:"+collection.contains("samsung"));
        collection.clear();

        if(collection.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }
}
