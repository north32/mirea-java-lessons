package ru.north32.mireajava.lesson21.exercise3;

import ru.north32.mireajava.lesson21.exercise3.document.Document;
import ru.north32.mireajava.lesson21.exercise3.document.Status;
import ru.north32.mireajava.lesson21.exercise3.document.factory.AbstractDocumentFactory;
import ru.north32.mireajava.lesson21.exercise3.document.factory.DocumentFactoryProvider;

import javax.swing.*;
import java.util.List;

public class Application {

    private JLabel label;
    private AbstractDocumentFactory documentFactory;
    private Document document;

    public Application() {
        JFrame frame = new JFrame("Document");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.label = new JLabel();
        JPanel contents = new JPanel();
        contents.add(label);
        frame.setContentPane(contents);

        frame.setJMenuBar(createMenuBar());

        frame.setSize(400, 300);
        frame.setVisible(true);

        chooseDocumentFactory("text");
        updateInfo();
    }

    private void chooseDocumentFactory(String type) {
        this.documentFactory = DocumentFactoryProvider.getFactory(type);
    }

    private void makeAction(String action) {
        if (action.equals("create")) {
            this.document = documentFactory.create();
        } else if (action.equals("open")) {
            this.document = documentFactory.open();
        } else if (action.equals("save")) {
            if (document != null) {
                document.setStatus(Status.SAVED);
            }
        }
    }

    private void updateInfo() {
        if (document == null) {
            label.setText("Document { type: null, status: null }");
        } else {
            label.setText(String.format(
                    "Document { type: %s, status: %s }",
                    document.getType(),
                    document.getStatus().toString()
            ));
        }
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("type");
        List.of(
                "image",
                "music",
                "text"
        ).forEach(type -> {
                    JMenuItem button = new JMenuItem(type);
                    button.addActionListener(e -> {
                        chooseDocumentFactory(type);
                    });
                    menu1.add(button);
        });
        menuBar.add(menu1);

        JMenu menu2 = new JMenu("action");
        List.of(
                "create",
                "open",
                "save"
        ).forEach(action -> {
            JMenuItem button = new JMenuItem(action);
            button.addActionListener(e -> {
                makeAction(action);
                updateInfo();
            });
            menu2.add(button);
        });
        menuBar.add(menu2);

        return menuBar;
    }

    public static void main(String[] args) {
        new Application();
    }

}
