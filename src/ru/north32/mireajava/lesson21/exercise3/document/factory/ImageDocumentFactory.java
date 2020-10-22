package ru.north32.mireajava.lesson21.exercise3.document.factory;

import ru.north32.mireajava.lesson21.exercise3.document.Document;
import ru.north32.mireajava.lesson21.exercise3.document.ImageDocument;
import ru.north32.mireajava.lesson21.exercise3.document.Status;

public class ImageDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new ImageDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new ImageDocument(Status.OPENED);
    }
}
