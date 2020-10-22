package ru.north32.mireajava.lesson21.exercise3.document.factory;

import ru.north32.mireajava.lesson21.exercise3.document.Document;
import ru.north32.mireajava.lesson21.exercise3.document.Status;
import ru.north32.mireajava.lesson21.exercise3.document.TextDocument;

public class TextDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new TextDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new TextDocument(Status.OPENED);
    }
}
