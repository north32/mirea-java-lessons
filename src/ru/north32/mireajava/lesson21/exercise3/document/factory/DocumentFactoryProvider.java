package ru.north32.mireajava.lesson21.exercise3.document.factory;

public class DocumentFactoryProvider {

    public static AbstractDocumentFactory getFactory(String type) {
        if (type.equals("image")) {
            return new ImageDocumentFactory();
        }
        if (type.equals("music")) {
            return new MusicDocumentFactory();
        }
        if (type.equals("text")) {
            return new TextDocumentFactory();
        }
        return null;
    }

}
