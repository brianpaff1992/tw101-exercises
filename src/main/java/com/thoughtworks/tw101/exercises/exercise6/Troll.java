package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Brian on 8/28/2015.
 */
public class Troll implements Monster{
    int hitpoints;
    String name;

    public Troll()
    {
        name = "Troll";
        hitpoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        amount = amount / 2;

        hitpoints = hitpoints - amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + "'s hitpoints are currently " + hitpoints);
    }
}
