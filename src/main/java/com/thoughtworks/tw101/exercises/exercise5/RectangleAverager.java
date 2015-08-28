package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int totalArea = 0;
        float average;

        //Get the total area first
        for (Rectangle r: rectangles)
        {
            int areaOfRectangle = r.area();
            totalArea = totalArea + areaOfRectangle;
        }

        //Get the average by dividing the total area by the amount of rectangles
        average = (float) totalArea / rectangles.length;
        return average;
    }
}
