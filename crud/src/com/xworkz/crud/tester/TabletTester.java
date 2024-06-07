package com.xworkz.crud.tester;

import java.util.ArrayList;
import java.util.Collection;

public class TabletTester {
    public static void main(String[] args) {
        Collection<String> collection=  new ArrayList<String>();

        collection.add("dolo");
        collection.add("crosin");
        collection.add("dot");
        collection.add("citrizen");
        collection.add("dot capsule");

        System.out.println(collection);
        collection.remove("crosin");

        System.out.println(collection);
        System.out.println("Size is:"+collection.size());

        System.out.println("Checking for value:"+collection.contains("dolo"));
        collection.clear();

        if(collection.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }
}
