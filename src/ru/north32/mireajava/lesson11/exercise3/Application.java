package ru.north32.mireajava.lesson11.exercise3;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;

public class Application {

    public Application() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea area = new JTextArea(3, 20);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area));
        frame.setContentPane(contents);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenu(area));
        frame.setJMenuBar(menuBar);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public JMenu createMenu(JTextArea area) {
        JMenu menu = new JMenu("View");

        Map.of(
                "Blue", Color.BLUE,
                "Red", Color.RED,
                "Black", Color.BLACK
        ).forEach((key, value) -> {
            JMenuItem button = new JMenuItem(key);
            button.addActionListener(e -> area.setSelectedTextColor(value));
            menu.add(button);
        });

        menu.add( new JSeparator());

        List.of("Times New Roman", "MS Sans Serif", "Courier New").forEach(value -> {
            JMenuItem button = new JMenuItem(value);
            button.addActionListener(e -> {
                Font font = new Font(value, Font.BOLD, 14);
                area.setFont(font);
            });
            menu.add(button);
        });

        return menu;
    }

    public static void main(String[] args) {
        new Application();
    }

}