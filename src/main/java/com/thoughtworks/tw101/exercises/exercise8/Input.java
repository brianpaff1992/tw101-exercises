package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by Brian on 8/28/2015.
 */
public class Input {
    Scanner input;

    public Input()
    {

        input = new Scanner(System.in);
    }

    public int readNext()
    {
        while(!input.hasNextInt()) {
            input.next();
            System.out.println("Please input a number and then press enter");
        }
        return input.nextInt();
    }

}
