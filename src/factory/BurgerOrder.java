package factory;

public class BurgerOrder implements Order{
    @Override
    public void placeOrder() {
        System.out.println("Burger order has been placed");
    }
}
