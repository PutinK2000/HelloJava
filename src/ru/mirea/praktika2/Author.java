package ru.mirea.praktika2;
import java.lang.*;

public class Author {

    private String Name;
    private String Email;
    private char Gender;

    public Author(String name, String email, char gender) {
        Name = name;
        Email = email;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public char getGender() {
        return Gender;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Gender=" + Gender +
                '}';
    }
}