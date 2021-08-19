package com.company;

public class Armor extends Items{
    private int id;
    private String name;
    private int block;
    private int coin;

    public Armor(int id, String name, int block, int coin) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.coin = coin;
    }

    public static Armor[] armors(){
        Armor[] armorList = {new LightArmor(),new MediumArmor(),new HeavyArmor()};
        return armorList;
    }
    public static Armor getArmorObjById(int id){
        for (Armor a : armors()){
            if (a.getId() == id){
                return a;
            }
        }
        return null;
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

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

}
