package factory;

class BurgerOrder extends Order {
    @Override
    public Item createOrder() {
        return new Burger();
    }
}
