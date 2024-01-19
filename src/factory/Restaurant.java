package factory;

public class Restaurant {
    public static void main(String[] args) {
        // Create Burger Order
        Order burgerOrder = new BurgerOrder();
        Item burger = burgerOrder.createOrder();
        System.out.println(burger.getPrice());

        // Create Pizza Order
        Order pizzaOrder = new PizzaOrder();
        Item pizza = pizzaOrder.createOrder();
        System.out.println(pizza.getPrice());
    }
}