package com.company;

public class Exit extends Location{

    public Exit(Player player) {
        super(player, 0, "Çıkış", "Oyun Sonlanır !");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
