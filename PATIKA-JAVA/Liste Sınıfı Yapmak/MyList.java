package com.generics;

public class MyList <T>{
    int capacity;
    T[] list;
    T[] copyList;

    public MyList() {
        this.capacity = 10;
        this.list = (T[]) new Object[this.capacity];
        this.copyList = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[this.capacity];
        this.copyList = (T[]) new Object[this.capacity];
    }
    // ekleme
    int count = 0;
    public boolean add(T data){
        int i = 0, j = 0, c = this.capacity;
        if (count == this.capacity){
            this.capacity *= 2;
            while (true){
                copyList[i] = list[i];
                i++;
                if (i == c)
                    break;
            }
            this.list = (T[]) new Object[this.capacity];
            while (true){
                copyList[j] = list[j];
                j++;
                if (j == c)
                    break;
            }
            this.list = (T[]) new Object[this.capacity];
        }
        add(data,count);
        count++;
        return true;
    }
    public void add(T data, int count){
        list[count] = data;
    }

    // index döndürme
    public T get(int value){
        int size = size();
        T t = list[value];
        if (value < 0 || value > size){
            return null;
        }
        return t;

    }
    // boyut
    public int size(){
        int size = 0;
        for (T t: list){
            if (t != null){
                size++;
            }
        }
        return size;
    }
    // verilen indexe değer ekleme
    public void set(int index, T value){
        list[index] = value;
    }
    // silme
    public void remove(int index){
        int size = size();
        if (index < 0 || index > size){
             list[index] = null;
        }
        else{
            for(int i = index; i < size; i++){
                list[index] = list[index + 1];
            }
            count--;
        }
    }
    // yazdırma
    public String toString(){
        int size = size();
        String str = "";
        str += "[";

        for (int i = 0; i < size; i++){
            if (list[i] != null){
                if (list[i+1] == null){
                    str += list[i];
                }
                else {
                    str += list[i] + ",";
                }
            }
        }
        str += "]";
        return str;
    }
    // boş mu?
    public boolean isEmpty(){
        int size = size();
        if (size == 0){
            return true;
        }
        return false;
    }

    // ilk index bulma
    public int indexOf(T data){
        int size = size();
        for (int i = 0; i < size; i++){
            if (list[i] == data){
                return i;
            }
        }
        return -1;
    }
    // son index bulma
    public int lastIndexOf(T data){
        int size = size();

        for (int i = size; i >= 0; i--){
            if (list[i] == data)
                return i;
        }
        return -1;
    }

    // yeni dizi
    public T[] toArray(){
        int size = size();
        T[] arr = (T[]) new  Object[size];
        for (int i = 0; i < size; i++){
            arr[i] = list[i];
        }
        return arr;
    }
    // alt liste
    public MyList<T> subList(int start,int finish){
        MyList<T> subList = new MyList<>();

        for (int i = start; i<= finish; i++){
            subList.add((T) list[i]);
        }
        return subList;
    }
    // aranan eleman var mı?
    public boolean contains(T value){
        for (int i = 0; i< size(); i++){
            if (list[i] == value)
                return true;
        }
        return false;
    }
    // temizleme
    public void clear(){
        this.list = (T[]) new Object[0];
        for (T t: list){
            System.out.print(t);
        }
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
