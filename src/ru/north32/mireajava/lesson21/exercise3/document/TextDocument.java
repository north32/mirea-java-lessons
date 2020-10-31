package ru.north32.mireajava.lesson21.exercise3.document;

public class TextDocument extends Document {

    public TextDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "text";
    }

}
