package com.threads;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        List<Integer> liste1 = new ArrayList<>();
        List<Integer> liste2 = new ArrayList<>();
        List<Integer> liste3 = new ArrayList<>();
        List<Integer> liste4 = new ArrayList<>();

        for (int i = 0; i<10000; i++){
            liste.add(i);
        }
        for (int i = 0; i<10000; i++){
            if (i<2500){
                liste1.add(i);
            }
            else if (i >= 2500 &&i<5000){
                liste2.add(i);
            }
            else if (i>= 5000 && i < 7500){
                liste3.add(i);
            }
            else{
                liste4.add(i);
            }
        }
        Liste list1 = new Liste(liste1);
        Liste list2 = new Liste(liste2);
        Liste list3 = new Liste(liste3);
        Liste list4 = new Liste(liste4);

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        Thread t4 = new Thread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
