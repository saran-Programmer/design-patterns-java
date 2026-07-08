package template.withpattern;

public abstract class DeliveryManagementService {

    private double orderAmount;
    private double finalPrice;

    public DeliveryManagementService(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public final void processOrder() {
        receiveOrder();
        validateOrder();
        prepareOrder();
        calculateFinalPrice();
        processPayment();
        arrangeDelivery();
        notifyCustomer();
        System.out.println();
    }

    private void receiveOrder() {
        System.out.println("1. Receiving order.");
    }

    protected abstract void validateOrder();

    private void prepareOrder() {
        System.out.println("3. Preparing food for the order.");
    }

    protected abstract void calculateFinalPrice();

    private void processPayment() {
        System.out.println("5. Processing payment of Rs. " + finalPrice + ".");
    }

    protected void arrangeDelivery() {
        // Hook method: subclasses can override this only when delivery is required.
    }

    protected void notifyCustomer() {
        // Hook method: subclasses can override this only when a custom notification is required.
    }

    protected double getOrderAmount() {
        return orderAmount;
    }

    protected void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
