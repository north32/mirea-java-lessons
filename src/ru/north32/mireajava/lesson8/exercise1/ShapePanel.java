package ru.north32.mireajava.lesson8.exercise1;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapePanel extends JPanel {

    private List<Shape> shapes = new ArrayList<>();

    public ShapePanel(Dimension dimension, int n) {
        setBackground(Color.BLACK);
        setPreferredSize(dimension);

        List<Color> colors = List.of(
                Color.RED, Color.ORANGE, Color.YELLOW,
                Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA
        );

        List<Class<? extends Shape>> supplies = List.of(Circle.class, Star.class, Diamond.class);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            try {
                Shape shape = random(random, supplies)
                        .getDeclaredConstructor(
                                Color.class,
                                int.class,
                                int.class
                        )
                        .newInstance(
                                random(random, colors),
                                random.nextInt(dimension.height),
                                random.nextInt(dimension.width));

                shapes.add(shape);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    private <E> E random(Random random, List<E> list) {
        return list.get(random.nextInt(list.size()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

}
