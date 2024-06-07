package com.xworkz.crud.tester;
import java.util.*;

public class CTester {
    public static void main(String[] args) {
        Collection<String> collection=  new ArrayList<String>();

        collection.add("Neetha");
        collection.add("Deeksha");
        collection.add("Rajendra");
        collection.add("Chetan");
        collection.add("Vivek");

        System.out.println(collection);
        collection.remove("Neetha");

        System.out.println(collection);
        System.out.println("Size is:"+collection.size());

        System.out.println("Checking for value:"+collection.contains("Chetan"));
        collection.clear();

        if(collection.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }
}

