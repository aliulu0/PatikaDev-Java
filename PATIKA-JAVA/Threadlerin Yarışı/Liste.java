package com.threads;

import java.util.ArrayList;
import java.util.List;

public class Liste implements Runnable{

    static List<Integer> list = new ArrayList<>();
    static List<Integer> evenList = new ArrayList<>();
    static List<Integer> oddList = new ArrayList<>();
    int id;
    private final Object LOCK = new Object();

    public Liste(List<Integer> liste){
        this.id = 0;
        this.list = liste;
    }

    @Override
    public void run() {
        for (int i = 0; i<list.size();i++ ){
            synchronized (LOCK){
                this.id++;
                System.out.println(Thread.currentThread().getName()+" - id: "+list.get(i));
                if (id % 2 == 0){
                    synchronized (LOCK){
                        evenList.add(id);
                    }
                }
                else {
                    synchronized (LOCK){
                        oddList.add(id);
                    }
                }
            }
        }
    }
}
