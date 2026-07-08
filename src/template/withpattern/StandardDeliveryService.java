package template.withpattern;

public class StandardDeliveryService extends DeliveryManagementService {

    private double deliveryFee;

    public StandardDeliveryService(double orderAmount) {
        super(orderAmount);
        this.deliveryFee = 40.0;
    }

    @Override
    protected void validateOrder() {
        System.out.println("2. Validating standard delivery order.");
    }

    @Override
    protected void calculateFinalPrice() {
        double finalPrice = getOrderAmount() + deliveryFee;
        setFinalPrice(finalPrice);
        System.out.println("4. Calculating final price with standard delivery fee: Rs. " + finalPrice);
    }

    @Override
    protected void arrangeDelivery() {
        System.out.println("6. Assigning a regular delivery partner.");
    }
}
