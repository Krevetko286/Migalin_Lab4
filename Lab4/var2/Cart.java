package ru.mirea.gibo4.Lab4.var2;

class Cart
{
    int cartTotal = 0;

    void increaseTotal(Priceable priceable)
    {
        cartTotal += priceable.getPrice();
    }
}

