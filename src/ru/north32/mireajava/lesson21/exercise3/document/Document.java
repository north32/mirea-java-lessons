package ru.north32.mireajava.lesson21.exercise3.document;

public abstract class Document {

    private Status status;

    public Document(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void save() {
        this.status = Status.SAVED;
    }

    public abstract String getType();
}
