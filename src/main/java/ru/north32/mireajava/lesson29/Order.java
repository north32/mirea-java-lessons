package ru.north32.mireajava.lesson29;

public interface Order {

    boolean add(Item item);

    String[] itemsNames();

    int itemsQuantity();

    int itemQuantity(String itemName);

    Item[] getItems();

    boolean remove(String itemName);

    int removeAll(String itemName);

    Item[] sortedItemByCostDesc();

    int costTotal();

}
