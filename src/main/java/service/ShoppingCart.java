package service;

import model.Food;


public class ShoppingCart {

    protected Food[] basketForCount;
    //помещаем массив basket в поле basketForCount

    public ShoppingCart(Food[] basket) {
        this.basketForCount = basket;
    }


    public String TotalBasketSum() {
        double totalAmount = 0.0;
        for (int i = 0; i < basketForCount.length; i++) {
            totalAmount =
                    totalAmount + basketForCount[i].getAmount() * basketForCount[i].getPrice();
        }
        return "Общая стоимость вашей корзины: " + totalAmount;
    }

    public String TotalBasketSumWithDiscount() {
        double totalAmountWithDiscount = 0.0;
        for (int i = 0; i < basketForCount.length; i++) {
            totalAmountWithDiscount =
                    totalAmountWithDiscount + basketForCount[i].getAmount() * basketForCount[i].getPrice()
                            * (1 - basketForCount[i].getDiscount() / 100);
        }
        return "Общая стоимость вашей корзины с учетом скидок: " + totalAmountWithDiscount;
    }

    public String TotalVegetarianBasketSum() {
        double totalVegetarianAmount = 0.0;
        for (int i = 0; i < basketForCount.length; i++) {
            if (basketForCount[i].isVegetarian()) {
                totalVegetarianAmount =
                        totalVegetarianAmount + basketForCount[i].getAmount() * basketForCount[i].getPrice();
            }
        }
        return "Общая стоимость вегетарианских продуктов в вашей корзине: " + totalVegetarianAmount;
    }

}
