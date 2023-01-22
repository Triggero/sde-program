package factory;

public class Restaurant {
    public static void main(String[] args) {
        OrderFactory orderFactory = new OrderFactory();
        // If the foodType is set to Pizza, a pizza order will be placed instead.
        Order order = orderFactory.createOrder("Burger");
        order.placeOrder();
    }
}
