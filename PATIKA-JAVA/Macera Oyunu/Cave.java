package com.company;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, 3,"Mağara",new Zombie(),new Food(), 3,"Mağaraya git ve ödülünü al ! Ödül<Yemek>");
    }
}
