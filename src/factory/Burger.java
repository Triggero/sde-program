package factory;

class Burger implements Item {
    @Override
    public String getPrice() {
        return "Burger Price: $5.00";
    }
}
