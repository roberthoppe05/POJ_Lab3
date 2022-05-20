package com.company.Zad3_2;

public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Author " +
                "name = " + name + " surname = " + surname + ", age = " + age;
    }
}
