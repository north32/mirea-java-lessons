package ru.north32.mireajava.lesson3.exercise2;

public class Human {

    private BodyPart[] bodyParts = {
            new Head(),
            new Torso(),
            new Hand(), new Hand(),
            new Leg(), new Leg() };

    public void setBodyParts(BodyPart[] bodyParts) {
        this.bodyParts = bodyParts;
    }

    public BodyPart[] getBodyParts() {
        return bodyParts;
    }
}
