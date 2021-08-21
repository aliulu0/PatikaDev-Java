package com.patikaStore;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product {
    public static List<Notebook> notebooks = new ArrayList<>();

    public Notebook(int id, double unitPrice, double discountRate, int stockAmount, String productName, String brandName, int ram, double screenSize, int memory) {
        super(id, unitPrice, discountRate, stockAmount, productName, brandName, ram, screenSize, memory);
    }

        public static List<Notebook> add(){
        Scanner input = new Scanner(System.in);

        System.out.print("ÜrünAdı : ");
        String productName = input.next();
        System.out.println();

        System.out.print("Fiyat : ");
        double unitPrice = input.nextDouble();
        System.out.println();

        int i = 1;
        for(Brand brand : Brand.brands()) {
            System.out.println( i + brand.getName());
            i++;
        }
        System.out.println();

        System.out.print("Marka : ");
        int brandid = input.nextInt();
        System.out.println();

        System.out.print("Depolama : ");
        int memory = input.nextInt();
        System.out.println();

        System.out.print("Ekran : ");
        int screenSize = input.nextInt();
        System.out.println();

        System.out.print("Ram : ");
        int ram = input.nextInt();
        System.out.println();

        String brandname = null;
        for(Brand brand : Brand.brands()) {
            if(brand.getId() == brandid) {
                brandname = brand.getName();
            }
        }
        int id =  0;
        for(Notebook notebook : notebooks) {
            if(notebook.getId()>id) {
                id = notebook.getId();
            }
        }
        id++;
        notebooks.add(new Notebook(id, unitPrice, 0, 0, productName, brandname, ram, screenSize, memory));
        return notebooks;
        }
        public static List<Notebook> filterId(int id){
        List<Notebook> filterNotebook = new ArrayList<>();

        for (Notebook notebook : notebooks){
            if (notebook.getId() == id){
                filterNotebook.add(notebook);
            }
        }
        return filterNotebook;
        }

        public static boolean remove(int id){
        try {
            notebooks.remove(id-1);
        }
        catch (Exception e){
            return false;
        }
        return true;
        }
        public static List<Notebook> filterBrand(int id){
            List<Notebook> filterNotebook = new ArrayList<>();
            for (Notebook notebook: notebooks){
                if (notebook.getBrand() == Brand.brand(id)){
                filterNotebook.add(notebook);
                }
            }
            return filterNotebook;
        }
        public static List<Notebook> notebookList(){

        notebooks.add(new Notebook(1, 3199.0, 0.0, 5, "HUAWEI Matebook 14", Brand.brand(4)+" ", 16, 14, 512));
        notebooks.add(new Notebook(2,7379.0, 0.0, 5, "LENOVO V14 IGL \t", Brand.brand(2), 8, 14, 1024));
        notebooks.add(new Notebook(3, 4012.0, 0.0, 5, "ASUS Tuf Gaming\t", Brand.brand(6)+"\t ", 32, 15.6,2048));
        return notebooks;
        }

}
