package factory;

class Pizza implements Item {
    @Override
    public String getPrice() {
        return "Pizza Price: $8.00";
    }
}