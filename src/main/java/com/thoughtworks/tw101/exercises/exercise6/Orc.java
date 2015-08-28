package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Brian on 8/28/2015.
 */
public class Orc implements Monster {

    String name;
    int hitpoints;

    public Orc()
    {
        name = "Orc";
        hitpoints = 20;
    }


    @Override
    public void takeDamage(int amount) {

        hitpoints = hitpoints - amount;

    }

    @Override
    public void reportStatus() {

        System.out.println(name + "'s hitpoints are currently " + hitpoints);
    }
}
