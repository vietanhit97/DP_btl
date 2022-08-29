package Lab_2.bai_3;

public class CustomerServiceFacade {
    private Billing billing;
    private OrderFullfillment orderFullfillment;
    private Shipping shipping;

    public CustomerServiceFacade() {
        billing = new Billing();
        orderFullfillment = new OrderFullfillment();
        shipping = new Shipping();
    }

    public void getOrder(String customerName,String phone,String address, int quantity,float price,String proName){
        orderFullfillment.getOrderDetails(proName,quantity);
        billing.totalAmount(quantity,price);
        shipping.shipTo(customerName, phone, address);
    }

}
