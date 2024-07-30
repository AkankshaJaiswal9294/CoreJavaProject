package com.corejava.variable.CollectionEx;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2
public class ExampleArrayList {
    public static void main(String[] args) {
        ExampleArrayList exampleArrayList = new ExampleArrayList();
        exampleArrayList.getArray();

    }

    public void getArray() {
//        ArrayList<String> list1 = new ArrayList<String>();
//        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<>();
        list3.add("Akanksha");
        list3.add("Vivek");
        list3.add("Roja");
        list3.add("Anirudh");
        list3.forEach(name -> log.info(name));
    }
}
