package com.company;

public class Items {

    private int id;
    private String name;

    public Items(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Items() {
    }

    public static Items[] items(){
        Items[] items = {new Pistol(),new Sword(),new Rifle(),new LightArmor(),new MediumArmor(),new HeavyArmor()};
        return items;
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
}
