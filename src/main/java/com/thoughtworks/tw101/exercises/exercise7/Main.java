package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        RandomNumber number = new RandomNumber();
        Input input = new Input();
        int userGuess = -1;


        do {
                System.out.print("Guess a number between 1 and 100: ");
                userGuess = input.readNext();
                if (number.compareGuess(userGuess) == 2)
                    System.out.println("My number is less than " + userGuess + ".");
                else if (number.compareGuess(userGuess) == 1)
                    System.out.println("My number is greater than " + userGuess + ".");
                else
                    System.out.println("Well done! " + userGuess + " was my number!");
        } while (number.compareGuess(userGuess) != 0);

    }
}
