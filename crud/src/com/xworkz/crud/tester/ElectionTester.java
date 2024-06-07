package com.xworkz.crud.tester;

import java.util.ArrayList;
import java.util.Collection;

public class ElectionTester {
    public static void main(String[] args) {
        Collection<String> collection=  new ArrayList<String>();

        collection.add("bjp");
        collection.add("congress");
        collection.add("nota");

        System.out.println(collection);
        collection.remove("nota");

        System.out.println(collection);
        System.out.println("Size is:"+collection.size());

        System.out.println("Checking for value:"+collection.contains("nota"));
        collection.clear();

        if(collection.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }
}
