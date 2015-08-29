package com.thoughtworks.tw101.exercises.exercise7;

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

        return input.nextInt();
    }


}
