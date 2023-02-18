package factory2;

class GetPriceFactory{

    public Order getOrder(String orderType){
        if(orderType == null){
            return null;
        }
        if(orderType.equalsIgnoreCase("Burger")) {
            return new Burger();
        }
        else if(orderType.equalsIgnoreCase("Pizza")){
            return new Pizza();
        }
        return null;
    }
}
