package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    //создаем поля класса
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    // делаем геттеры для полей
    public int getAmount() {

        return amount;
    }

    public double getPrice() {

        return price;
    }

    public boolean isVegetarian() {

        return isVegetarian;
    }

    //переопределяем метода родительского интерфейса
    @Override
    public double getDiscount() {

        return Discount.ZERO;
    }
}
