package com.xworkz.crud.tester;

import java.util.ArrayList;
import java.util.Collection;

public class SweetTester {
    public static void main(String[] args) {
        Collection<String> collection=  new ArrayList<String>();

        collection.add("peda");
        collection.add("jamoon");
        collection.add("rasmalai");
        collection.add("champakali");
        collection.add("jalebi");

        System.out.println(collection);
        collection.remove("rasmalai");

        System.out.println(collection);
        System.out.println("Size is:"+collection.size());

        System.out.println("Checking for value:"+collection.contains("jamoon"));
        collection.clear();

        if(collection.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }
}
