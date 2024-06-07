package com.xworkz.crud.tester;

import java.util.ArrayList;
import java.util.Collection;

public class SnackTester {
    public static void main(String[] args) {
        Collection<String> collection=  new ArrayList<String>();

        collection.add("samosa");
        collection.add("bhel");
        collection.add("chclt");
        collection.add("cookie");
        collection.add("chips");

        System.out.println(collection);
        collection.remove("bhel");

        System.out.println(collection);
        System.out.println("Size is:"+collection.size());

        System.out.println("Checking for value:"+collection.contains("cookie"));
        collection.clear();

        if(collection.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }
}
