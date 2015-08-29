package com.thoughtworks.tw101.exercises.exercise7;

import java.awt.*;
import java.util.Random;

/**
 * Created by Brian on 8/28/2015.
 */
public class RandomNumber {
    int number;

    public RandomNumber()
    {
        int upperBound = 100;
        int lowerBound = 1;
        Random randomNumber = new Random();
        number = randomNumber.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println(number);
    }

    public int compareGuess(int guessedNumber)
    {
        if(guessedNumber == number)
        {
            return 0;
        }
        else if (guessedNumber < number)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
}
