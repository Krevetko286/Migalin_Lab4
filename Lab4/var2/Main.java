package ru.mirea.gibo4.Lab4.var2;

public class Main
{
    public static void main(String[] args)
    {
        Priceable movie = new Movie();
        Priceable book = new Book();
        Cart cart = new Cart();

        System.out.println(cart.cartTotal); //prints 0

        cart.increaseTotal(movie);

        System.out.println(cart.cartTotal); //prints 25

        cart.increaseTotal(book);

        System.out.println(cart.cartTotal); //prints 57
    }
}

