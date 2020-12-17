package ru.mirea.gibo4.Lab4.var1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class Test {

    public static void main(String[] args) {
        final List<Nameable> space = new ArrayList<>();
        space.add(new Cosmonauts("Neil", "Armstrong"));
        space.add(new Cosmonauts("Yuri", "Gagarin"));
        space.add(new Planets("Mars"));
        space.add(new Planets("Venus"));

        print(System.out, "Name", space, Nameable::name);
    }

    private static <T> void print(PrintStream s, String title, List<T> list, Function<T, String> stringify) {
        s.println("\n" + title + ":");
        list.stream()
                .map(stringify)
                .forEach(string -> s.println("\t" + string));
        s.println();
    }
}

