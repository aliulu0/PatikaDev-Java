package com.company;

public class NormalLoc extends Location{


    public NormalLoc(Player player, int id, String name, String description) {
        super(player, id, name, description);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz ! \n");
        int i = 0;
        for(String inventory : Inventory.inventoryBag) {
            if(inventory.equals("Yemek")) {
                i++;
            }else if(inventory.equals("Su")) {
                i++;
            }else if (inventory.equals("Odun")) {
                i++;
            }
        }
        if(i == 3) {
            System.out.println("Tebrikler !! Oyunu kazandınız .");
            return false;
        }else {
            System.out.println("Gereken eşyalar eksik!!\n\nCanınız yenilendi \n\nOyuna devam edebilirsiniz");
            this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
            return true;
        }
    }
}
