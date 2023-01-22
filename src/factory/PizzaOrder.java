package factory;

public class PizzaOrder implements Order{
    @Override
    public void placeOrder() {
        System.out.println("Pizza order has been placed");
    }
}
