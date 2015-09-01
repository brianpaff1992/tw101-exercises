package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int totalArea = 0;
        float average;

        totalArea = getTotalArea(rectangles, totalArea);

        average = getaAverage(rectangles, totalArea);
        return average;
    }

    private float getaAverage(Rectangle[] rectangles, float totalArea) {
        return totalArea / rectangles.length;
    }

    private int getTotalArea(Rectangle[] rectangles, int totalArea) {
        for (Rectangle r: rectangles)
        {
            int areaOfRectangle = r.area();
            totalArea = totalArea + areaOfRectangle;
        }
        return totalArea;
    }
}
