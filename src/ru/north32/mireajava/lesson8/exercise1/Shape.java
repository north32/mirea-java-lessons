package ru.north32.mireajava.lesson8.exercise1;

import java.awt.*;

public abstract class Shape {

        public Color getColor() {
                return color;
        }

        public int getX() {
                return x;
        }

        public int getY() {
                return y;
        }

        private Color color;
        private int x, y;

        public Shape(Color color, int x, int y) {
                this.color = color;
                this.x = x;
                this.y = y;
        }

        public abstract void draw(Graphics g);
}
