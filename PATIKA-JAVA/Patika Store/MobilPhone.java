package com.patikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilPhone extends Product{
    private double battery;
    private int camera;
    private String color;

    public static List<MobilPhone> mobilPhones = new ArrayList<MobilPhone>();
    public MobilPhone(int id, double unitPrice, double discountRate, int stockAmount, String productName,
                      String brandName, int ram, double screenSize, int memory, double battery, String color) {

        super(id, unitPrice, discountRate, stockAmount, productName, brandName, ram, screenSize, memory);
        this.battery = battery;
        this.camera = camera;
        this.color = color;
    }


    public static List<MobilPhone> add(){
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("ÜrünAdı : ");
        String productName = input.next();
        System.out.println();

        System.out.print("Fiyat : ");
        double unitPrice = input.nextDouble();
        System.out.println();

        int i = 1;
        for(Brand brand : Brand.brands()) {
            System.out.println( i + " - " +brand.getName());
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
        double screenSize = input.nextInt();
        System.out.println();

        System.out.print("Ram : ");
        int ram = input.nextInt();
        System.out.println();

        System.out.print("Pil Gücü : ");
        double battery = input.nextDouble();
        System.out.println();

        System.out.print("Renk : ");
        String color = input.next();
        System.out.println();

        String brandName = null;
        for(Brand brand : Brand.brands()) {
            if(brand.getId() == brandid) {
                brandName = brand.getName();
            }
        }
        int id =  0;
        for(MobilPhone mobilPhone : mobilPhones) {
            if(mobilPhone.getId()>id) {
                id = mobilPhone.getId();
            }
        }
        id++;
        mobilPhones.add(new MobilPhone(id, unitPrice, 0.0, 0, productName, brandName, ram, screenSize, memory,battery,color));
        return mobilPhones;
    }

    public static boolean remove(int id){
        try {
            mobilPhones.remove(id-1);
        } catch (Exception e) {
            return false;
        }

        return true;

    }

    public static List<MobilPhone> filtreId(int id){
        List<MobilPhone> filtreList = new ArrayList<MobilPhone>();
        for(MobilPhone phone : mobilPhones) {
            if(phone.getId() == id){
                filtreList.add(phone);
            }
        }
        return filtreList;
    }

    public static List<MobilPhone> filtreBrand(int id){

        List<MobilPhone> filtreList = new ArrayList<MobilPhone>();
        for(MobilPhone phone : mobilPhones) {
            if(phone.getBrand() == Brand.brand(id) ){
                filtreList.add(phone);
            }
        }
        return filtreList;
    }

    public static List<MobilPhone> mobilPhonesList() {

        mobilPhones.add(new MobilPhone(1, 3199.0, 0.0, 5, "Samsung Galaxy A51 \t", Brand.brand(1), 6, 6.5, 128, 4000, "Siyah"));
        mobilPhones.add(new MobilPhone(2, 7379.0, 0.0, 5, "iPhone 11 64 GB \t\t", Brand.brand(3)+"\t", 6, 6.1, 64, 3046, "Mavi "));
        mobilPhones.add(new MobilPhone(3, 4012.0, 0.0, 5, "Redmi Note 10 Pro 8GB", Brand.brand(8)+"\t", 12, 6.5, 128, 4000, "Beyaz"));

        return mobilPhones;
    }


    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
