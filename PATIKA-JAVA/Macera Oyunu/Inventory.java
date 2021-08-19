package com.company;

public class Inventory {
    private Awards awards;
    private Weapon weapon;
    private Armor armor;
    public Inventory(){
        this.weapon = new Weapon("Yumruk",-1,0,0);
        this.armor = new Armor(-1,"Kumaş Parçası",0,0);
    }
    int count=0;
    static String[] inventoryBag = {"","","","","","","","","","",""};

    public  String[] inventoryBag(String award) {

        inventoryBag[count] = award;
        count++;
        return inventoryBag;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }


    public Awards getAwards() {
        return awards;
    }

    public void setAwards(Awards awards) {
        this.awards = awards;
    }
}
