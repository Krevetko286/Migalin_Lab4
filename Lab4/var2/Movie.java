package ru.mirea.gibo4.Lab4.var2;

class Movie implements Priceable{
    int price = 25;

    @Override
    public int getPrice()
    {
        return price;
    }
}

