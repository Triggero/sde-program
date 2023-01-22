package factory;

public class OrderFactory {
    public Order createOrder(String foodType) {

        if("Burger".equals(foodType)) {
            return new BurgerOrder();
        }else if("Pizza".equals(foodType)) {
            return new PizzaOrder();
        }
        return null;
    }
}
