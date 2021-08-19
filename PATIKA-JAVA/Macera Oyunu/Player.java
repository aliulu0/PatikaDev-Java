package com.company;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int originalHealth;
    private int coin;
    private String charName;
    private String name;
    Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {

        this.name = name;
        this.inventory = new Inventory();
    }


    public void selectCharacter() {
        GameCharacter[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("---------------------------------");
        for (GameCharacter gameChar : charList) {
            System.out.println("ID :" + gameChar.getId() +
                    "\tKarakter : " + gameChar.getName() +
                    "\t Hasar : " + gameChar.getDamage() +
                    "\t Sağlık : " + gameChar.getHealth() +
                    "\t Para : " + gameChar.getCoin());
        }
        System.out.println("----------------------------------");
        System.out.print("Lütfen karakter seçiniz : ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println(
                "Karakter : " + this.getCharName() +
                        "\t Hasar : " + this.getDamage() +
                        "\t Sağlık : " + this.getHealth() +
                        "\t Para : " + this.getCoin());
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setOriginalHealth(gameCharacter.getHealth());
        this.setCoin(gameCharacter.getCoin());
        this.setCharName(gameCharacter.getName());
    }
    public void printInfo(){
        System.out.println(
                "Silah : " +this.getInventory().getWeapon().getName()+
                        "\t, Zırh : " +this.getInventory().getArmor().getName()+
                        "\t, Bloklama : "+this.getInventory().getArmor().getBlock()+
                        "\t, Hasar : " + this.getTotalDamage() +
                        "\t, Sağlık : " + this.getHealth() +
                        "\t, Para : " + this.getCoin());
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 ){
            health = 0;
        }
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon(){return this.getInventory().getWeapon();}

    public Armor getArmor(){return this.getInventory().getArmor();}

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
