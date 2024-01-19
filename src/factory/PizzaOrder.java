package factory;

class PizzaOrder extends Order {
    @Override
    public Item createOrder() {
        return new Pizza();
    }
}