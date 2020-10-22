package ru.north32.mireajava.lesson21.exercise3.document.factory;

import ru.north32.mireajava.lesson21.exercise3.document.Document;
import ru.north32.mireajava.lesson21.exercise3.document.MusicDocument;
import ru.north32.mireajava.lesson21.exercise3.document.Status;

public class MusicDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new MusicDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new MusicDocument(Status.OPENED);
    }
}
