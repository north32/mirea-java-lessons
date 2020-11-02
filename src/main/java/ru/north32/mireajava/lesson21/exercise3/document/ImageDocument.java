package ru.north32.mireajava.lesson21.exercise3.document;

public class ImageDocument extends Document {

    public ImageDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "image";
    }

}
