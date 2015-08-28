package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {

        int result = 0;

        for(int i =1; i<=100; i++)
        {
            if(i%2 != 0) {
                //i is odd, add it to the result and print it out
                System.out.println(i);
                result = result + i;
            }
        }

        System.out.println("Sum of the numbers from 0 - 100: " + result);

    }
}
