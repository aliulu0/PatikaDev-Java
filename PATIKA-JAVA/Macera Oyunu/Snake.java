package com.company;

import java.util.Random;

public class Snake extends Monster{
    public Snake() {
        super(4, "Yılan", randomDamage(),12, new RandomItem());

    }
    public static Random random = new Random();
    public static int randomDamage(){

        return random.nextInt(4) + 3;
    }
}
