package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int totalArea = 0;
        float average;

        for (Rectangle r: rectangles)
        {
            int areaOfRectangle = r.area();
            totalArea = totalArea + areaOfRectangle;
        }

        average = (float) totalArea / rectangles.length;
        return average;
    }
}
