package ru.north32.mireajava.lesson21.exercise3.document;

public class MusicDocument extends Document {

    public MusicDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "music";
    }

}
