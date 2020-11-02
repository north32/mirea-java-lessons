package ru.north32.mireajava.lesson21.exercise3.document.factory;

import ru.north32.mireajava.lesson21.exercise3.document.Document;

public interface AbstractDocumentFactory {

    Document create();

    Document open();

}
