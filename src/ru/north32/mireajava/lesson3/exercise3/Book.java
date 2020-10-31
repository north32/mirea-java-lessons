package ru.north32.mireajava.lesson3.exercise3;

public class Book {

    private String author;
    private char gender;
    private String name;
    private int year;
    private String mail;

    public Book(String author, char gender, String name, int year, String mail) {
        this.author = author;
        this.gender = gender;
        this.name = name;
        this.year = year;
        this.mail = mail;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", mail='" + mail + '\'' +
                '}';
    }
}
