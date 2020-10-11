package ru.north32.mireajava.lesson11.exercise2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Application {

    public Application() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        textField.setColumns(30);
        panel.add(textField);
        ActionListener northAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в САО");
            dialog.setBounds(500, 500, 200, 100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener southAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЮАО");
            dialog.setBounds(500, 600, 200, 100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener eastAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ВАО");
            dialog.setBounds(800, 600, 200, 100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener westAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЗАО");
            dialog.setBounds(400, 600, 200, 100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener centerAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЦАО");
            dialog.setBounds(500, 500, 200, 100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        JButton northButton = new JButton("NORTH");
        panel.add(northButton, BorderLayout.NORTH);
        northButton.addActionListener(northAct);

        JButton southButton = new JButton("SOUTH");
        panel.add(southButton, BorderLayout.SOUTH);
        southButton.addActionListener(southAct);

        JButton eastButton = new JButton("EAST");
        panel.add(eastButton, BorderLayout.EAST);
        eastButton.addActionListener(eastAct);

        JButton westButton = new JButton("WEST");
        panel.add(westButton, BorderLayout.WEST);
        westButton.addActionListener(westAct);

        JButton centerButton = new JButton("CENTER");
        panel.add(centerButton, BorderLayout.CENTER);
        centerButton.addActionListener(westAct);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(600, 300));


        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Application();
    }
}