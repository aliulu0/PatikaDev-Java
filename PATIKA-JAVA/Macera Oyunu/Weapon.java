package com.company;

public class Weapon extends Items{
    private String name;
    private int id;
    private int damage;
    private int coin;

    public Weapon(String name, int id, int damage, int coin) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.coin = coin;
    }


    public static Weapon[] weapons(){
        Weapon[] weaponList = {new Pistol(),new Sword(),new Rifle()};
        return weaponList;

    }
    public static Weapon getWeaponObjById(int id){
        for (Weapon w : weapons()){
            if (w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
