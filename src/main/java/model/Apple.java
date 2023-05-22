package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    //добавляем поле, которого нет в родительком классе
    private String colour;


    // создаем конструктор для обьектов Apple и присваиваем значения его полям
    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    // делаем геттер для получения значения colour
    public String getColour() {

        return colour;
    }

    // переопределям метом родительского класса
    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.SIXTY;
        }
        return Discount.ZERO;
    }


}



