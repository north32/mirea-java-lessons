package ru.north32.mireajava.lesson28;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}
