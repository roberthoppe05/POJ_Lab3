package com.company.Zad3_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Boleslaw", "Prus", 55);
        Author author2 = new Author("Eliza", "Orzeszkowa", 34);


        System.out.println(author1.toString());

        author1.setSurname("Leśman");

        System.out.println(author1.toString());

        System.out.println("Name: " + author2.getName() + " " + author2.getAge());
    }
}
