package template.withpattern;

public class ExpressDeliveryService extends DeliveryManagementService {

    private double deliveryFee;

    public ExpressDeliveryService(double orderAmount) {
        super(orderAmount);
        this.deliveryFee = 90.0;
    }

    @Override
    protected void validateOrder() {
        System.out.println("2. Validating express delivery order.");
    }

    @Override
    protected void calculateFinalPrice() {
        double finalPrice = getOrderAmount() + deliveryFee;
        setFinalPrice(finalPrice);
        System.out.println("4. Calculating final price with express delivery fee: Rs. " + finalPrice);
    }

    @Override
    protected void arrangeDelivery() {
        System.out.println("6. Assigning a high-priority delivery partner.");
    }
}
