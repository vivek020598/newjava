package com.xworkz.crud.tester;

import java.util.ArrayList;
import java.util.Collection;

public class ClothTester {
    public static void main(String[] args) {
        Collection<String> collection=  new ArrayList<String>();

        collection.add("pant");
        collection.add("shirt");
        collection.add("jacket");
        collection.add("shorts");
        collection.add("hoodie");

        System.out.println(collection);
        collection.remove("shirt");

        System.out.println(collection);
        System.out.println("Size is:"+collection.size());

        System.out.println("Checking for value:"+collection.contains("shorts"));
        collection.clear();

        if(collection.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }
}
