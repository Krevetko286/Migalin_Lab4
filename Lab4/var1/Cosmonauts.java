package ru.mirea.gibo4.Lab4.var1;

public final class Cosmonauts implements Nameable {

    private final String firstName;
    private final String lastName;

    public Cosmonauts(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    @Override
    public String name() {
        return firstName + " " + lastName;
    }
}
