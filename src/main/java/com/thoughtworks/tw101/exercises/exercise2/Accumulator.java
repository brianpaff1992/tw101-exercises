package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int numberOfTimesCalled;

    public Accumulator()
    {

        numberOfTimesCalled = 0;
    }

    public void increment()
    {

        numberOfTimesCalled++;
    }

    public void total()
    {
        System.out.println("Number of times Accumulator.increment() was called: " + numberOfTimesCalled);
    }
}
