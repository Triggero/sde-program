package factory2;

abstract class Order{
    protected double price;
    abstract void getPrice();

    public void calculateBill(){
        System.out.println(price);
    }
}
