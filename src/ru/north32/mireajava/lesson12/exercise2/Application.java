package ru.north32.mireajava.lesson12.exercise2;

import ru.north32.mireajava.lesson12.exercise1.Planet;

import javax.swing.*;

public class Application {

    public Application() {
        JFrame frame = new JFrame("Planets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        JPanel contents = new JPanel();
        contents.add(label);
        frame.setContentPane(contents);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenu(label));
        frame.setJMenuBar(menuBar);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public JMenu createMenu(JLabel label) {
        JMenu menu = new JMenu("View");
        for (Planet planet : Planet.values()) {
            JMenuItem button = new JMenuItem(planet.name());
            button.addActionListener(e -> label.setText(planet.info()));
            menu.add(button);
        }
        return menu;
    }

    public static void main(String[] args) {
        new Application();
    }

}
