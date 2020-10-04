package ru.north32.mireajava.lesson8.exercise1;

import javax.swing.*;
import java.awt.*;

public class Application {

    public Application() {
        JFrame frame = new JFrame();
        frame.add(new ShapePanel(new Dimension(400,400), 20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }

}
