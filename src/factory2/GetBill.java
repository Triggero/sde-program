package factory2;
import java.io.*;

class GetBill{
    public static void main(String[] args)throws IOException{
        GetPriceFactory priceFactory = new GetPriceFactory();

        System.out.print("Enter the name of your chosen item: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String orderType=br.readLine();
        Order p = priceFactory.getOrder(orderType);

        System.out.print("Bill amount for "+orderType+" is: ");
        p.getPrice();
        p.calculateBill();
    }
}
