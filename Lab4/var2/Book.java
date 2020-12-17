package ru.mirea.gibo4.Lab4.var2;

class Book implements Priceable
{
    int royalty = 22;
    int markup = 10;

    @Override
    public int getPrice()
    {
        return royalty + markup;
    }
}

