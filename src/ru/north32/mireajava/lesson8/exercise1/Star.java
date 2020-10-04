package ru.north32.mireajava.lesson8.exercise1;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Star extends Shape {
    public Star(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {9, 15, 0, 18, 3};
        int[] yPoints = {0, 18, 6, 6, 18};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        star.moveTo(xPoints[0] + getX(), yPoints[0] + getY());
        for (int i = 1; i < xPoints.length; i++) {
            star.lineTo(xPoints[i] + getX(), yPoints[i] + getY());
        }
        star.closePath();
        g2d.setColor(getColor());
        g2d.fill(star);
    }
}
