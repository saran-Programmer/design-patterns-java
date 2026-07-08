package template.withpattern;

public class SelfPickupService extends DeliveryManagementService {

    public SelfPickupService(double orderAmount) {
        super(orderAmount);
    }

    @Override
    protected void validateOrder() {
        System.out.println("2. Validating self pickup order.");
    }

    @Override
    protected void calculateFinalPrice() {
        double finalPrice = getOrderAmount();
        setFinalPrice(finalPrice);
        System.out.println("4. Calculating final price without delivery fee: Rs. " + finalPrice);
    }

    @Override
    protected void notifyCustomer() {
        System.out.println("7. Notifying customer that the order is ready for pickup.");
    }
}
