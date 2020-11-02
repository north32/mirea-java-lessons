package ru.north32.mireajava.lesson8.exercise1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapePanel extends JPanel {

    private List<Shape> shapes = new ArrayList<>();
    private Dimension dimension;
    private int n;

    public ShapePanel(Dimension dimension, int n) {
        this.n = n;
        this.dimension = dimension;
        refresh();
    }

    @Override
    public Dimension getPreferredSize() {
        return dimension;
    }

    public void refresh() {
        shapes = new ArrayList<>(n);
        List<Color> colors = List.of(
                Color.RED, Color.ORANGE, Color.YELLOW,
                Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA
        );

        List<Shape.Supplier> suppliers = List.of(Circle::new, Star::new, Diamond::new);

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            Shape shape = random(r, suppliers).get(
                    random(r, colors),
                    r.nextInt(dimension.height),
                    r.nextInt(dimension.width)
            );
            shapes.add(shape);
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
