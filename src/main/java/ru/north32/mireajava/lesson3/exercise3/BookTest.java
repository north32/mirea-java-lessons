package ru.north32.mireajava.lesson3.exercise3;

public class BookTest {

    public static void main(String[] args) {
        Book book =
                new Book("Sun Tzu", 'M', "The Art of War", -500, null);

        System.out.println(book.getAuthor().equals("Sun Tzu"));
        System.out.println(book.getGender() == 'M');
        System.out.println(book.getName().equals("The Art of War"));
        System.out.println(book.getYear() == -500);
        System.out.println(book.getMail() == null);
    }

}
