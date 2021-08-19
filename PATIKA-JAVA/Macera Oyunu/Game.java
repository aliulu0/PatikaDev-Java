package com.company;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Oyuna hoşgeldiniz!");
        System.out.println("Lütfen bir isim giriniz: ");
        //String playerName = input.nextLine();
        Player player = new Player("Ali");
        System.out.println("Merhaba "+player.getName() + " bu tehlikeli dünyaya hoşgeldin ! Bu tehlikeli yolculukta sana iyi şanslar !!");
        player.selectCharacter();
        Location currentLocation = null;
        while(true){
            player.printInfo();
            Location[] locations = {new Exit(player),new SafeHouse(player), new ToolStore(player), new Cave(player),new Forest(player),new River(player),new Mine(player)};
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("********** Bölgeler **********");
            System.out.println();
            for (Location l : locations){
                System.out.println(l.getId()+" - "+ l.getName()+"  -->  "+l.getDescription());
            }
            System.out.println("-------------------------------------------");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz :");
            int selectedLoc = input.nextInt();
            for (Location location : locations) {
                while (selectedLoc < 0 || selectedLoc > locations.length) {
                    System.out.println("Geçersiz Değer Girdiniz ! Tekrar giriniz !! ");
                    System.out.print("Girilen Değer : ");
                    selectedLoc = input.nextInt();
                }
                if (selectedLoc == location.getId()) {
                    if (selectedLoc == location.getId()) {
                        for (int i = 0; i < Inventory.inventoryBag.length; i++) {
                            if (location.getName().equals("Mağara") && Inventory.inventoryBag[i] == "Yemek") {
                                System.out.println("Burayı daha önce tamamladın.Tekrar giremezsin !!");
                                System.out.println("Güvenli eve gönderiliyorsun !! ");
                                currentLocation = locations[1];
                                break;
                            } else if (location.getName().equals("Nehir") && Inventory.inventoryBag[i] == "Su") {
                                System.out.println("Burayı daha önce tamamladın.Tekrar giremezsin !!");
                                System.out.println("Güvenli eve gönderiliyorsun !! ");
                                currentLocation = locations[1];
                                break;
                            } else if (location.getName().equals("Orman") && Inventory.inventoryBag[i] == "Odun") {
                                System.out.println("Burayı daha önce tamamladın.Tekrar giremezsin !!");
                                System.out.println("Güvenli eve gönderiliyorsun !! ");
                                currentLocation = locations[1];
                                break;
                            } else {
                                currentLocation = location;
                            }
                        }
                    }
                }
            }
            System.out.println();
            if(!currentLocation.onLocation()) {
                System.out.println("Oyunu kaybettiniz");
                break;
            }
        }

    }
}
