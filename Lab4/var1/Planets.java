package ru.mirea.gibo4.Lab4.var1;

public final class Planets implements Nameable {

    private final String name;

    public Planets(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
