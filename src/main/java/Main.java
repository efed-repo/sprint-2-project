import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        // создаем обьекты для корзины
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        //создаем массив из обьектов
        Food[] basket = {meat, redApple, greenApple};

        // создаем обьект ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart(basket);

        //вызываем методы расчета из класса ShoppingCart
        String totalBasketSum = shoppingCart.TotalBasketSum();
        String totalBasketSumWithDiscount = shoppingCart.TotalBasketSumWithDiscount();
        String totalVegetarianBasket = shoppingCart.TotalVegetarianBasketSum();

        //выводм результаты работы методов в консоль
        System.out.println(totalBasketSum);
        System.out.println(totalBasketSumWithDiscount);
        System.out.println(totalVegetarianBasket);

    }

}
