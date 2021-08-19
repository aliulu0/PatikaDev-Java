package com.company;

import java.util.Random;

public class Monster {
    private int id;
    private String name;
    private int damage;
    private int health;
    private Awards award;
    private int coin;
    private int originalHealth;

    public Monster(int id, String name, int damage, int health, Awards award) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.award = award;
    }

    public static int awardMoney() {
        Random rnd = new Random();
        int i = rnd.nextInt(100);
        if(i<50) {
            return 1;
        }else if(i <80) {
            return 5;
        }else {
            return 10;
        }
    }

    public int getCoin() {


        if(this.getName().equals("Zombi")) {
            this.coin = (award.getId()/10)*4;
        }else if(this.getName().equals("Kurt Adam")) {
            this.coin = (award.getId()/10)*7;
        }else if (this.getName().equals("Vampir")){
            this.coin = (award.getId()/10)*12;
        }else if (this.getName().equals("Yılan")) {
            if(award.getId() == 10) {
                this.coin =awardMoney();
            }
        }
        return coin;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.health = health;
    }

    public Awards getAward() {
        return award;
    }

    public void setAward(Awards award) {
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
