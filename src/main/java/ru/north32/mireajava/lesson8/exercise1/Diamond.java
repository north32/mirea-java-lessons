package ru.north32.mireajava.lesson8.exercise1;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Diamond extends Shape {

    public Diamond(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {9, 18, 9, 0};
        int[] yPoints = {0, 9, 18, 9};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath diamond = new GeneralPath();

        diamond.moveTo(xPoints[0] + getX(), yPoints[0] + getY());
        for (int i = 1; i < xPoints.length; i++) {
            diamond.lineTo(xPoints[i] + getX(), yPoints[i] + getY());
        }
        diamond.closePath();
        g2d.setColor(getColor());
        g2d.fill(diamond);
    }
}
