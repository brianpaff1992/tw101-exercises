package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        //Quick check to make sure start value is less than or equal to the end value
        if(start > end)
        {
            return -1;
        }
        else {
            int result = 0;

            for (int i = start; i<= end; i++)
            {
                if(i%2 != 0) {
                    //i is odd, add it to the result
                    result = result + i;
                }
            }
            return result;
        }
    }
}
