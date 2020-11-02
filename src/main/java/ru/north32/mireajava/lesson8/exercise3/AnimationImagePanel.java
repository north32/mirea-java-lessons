package ru.north32.mireajava.lesson8.exercise3;

import javax.swing.*;
import java.awt.*;

public class AnimationImagePanel extends JPanel {

    private final ImageIcon image;

    public AnimationImagePanel(String path) {
        image = new ImageIcon(path);
        Timer timer = new Timer(40, e -> repaint());
        timer.start();
    }

    @Override
    public Dimension getPreferredSize() {
        return image == null ? new Dimension(0, 0) :
                new Dimension(image.getIconWidth(), image.getIconHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int x = (getWidth() - image.getIconWidth()) / 2;
            int y = (getHeight() - image.getIconHeight()) / 2;
            image.paintIcon(this, g, x, y);
        }
    }

}
