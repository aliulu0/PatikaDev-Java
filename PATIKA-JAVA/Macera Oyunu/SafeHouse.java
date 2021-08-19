package com.company;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, 1,"Güvenli Ev","Güvenli bölge. Canınız Yenilenir.");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz ! \nCanınız yenilendi !");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
