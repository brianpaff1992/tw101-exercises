package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        RandomNumber number = new RandomNumber();
        Input input = new Input();
        int userGuess = -1;
        ArrayList<Integer> userGuesses = new ArrayList<Integer>();


        do {
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = input.readNext();
            userGuesses.add(userGuess);
            if (number.compareGuess(userGuess) == 2)
                System.out.println("My number is less than " + userGuess + ".");
            else if (number.compareGuess(userGuess) == 1)
                System.out.println("My number is greater than " + userGuess + ".");
            else
                System.out.println("Well done! " + userGuess + " was my number!");
        } while (number.compareGuess(userGuess) != 0);

        System.out.print("Your guesses were - ");
        String returnString = "";
        for(Integer i : userGuesses)
        {
            returnString = returnString + i + ", ";
        }

        returnString = returnString.substring(0, returnString.length() - 2);
        System.out.println(returnString);


    }
}
