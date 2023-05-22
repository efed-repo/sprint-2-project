package model;


public class Meat extends Food {

    //создаем конструктор для обьектов Meat и присваиваем значения его полям
    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }
}
