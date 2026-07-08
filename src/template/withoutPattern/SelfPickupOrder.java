package template.withoutPattern;

public class SelfPickupOrder {

    private double orderAmount;
    private double finalPrice;

    public SelfPickupOrder(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void processOrder() {
        System.out.println("Processing Self Pickup Order");
        validateOrder();
        prepareOrder();
        calculateFinalPrice();
        processPayment();
        arrangeDelivery();
        notifyCustomer();
        System.out.println();
    }

    private void validateOrder() {
        System.out.println("1. Validating self pickup order.");
    }

    private void prepareOrder() {
        System.out.println("2. Preparing food for self pickup.");
    }

    private void calculateFinalPrice() {
        finalPrice = orderAmount;
        System.out.println("3. Calculating final price without delivery fee: Rs. " + finalPrice);
    }

    private void processPayment() {
        System.out.println("4. Processing payment of Rs. " + finalPrice + " for self pickup order.");
    }

    private void arrangeDelivery() {
        System.out.println("5. No delivery partner required for self pickup.");
    }

    private void notifyCustomer() {
        System.out.println("6. Notifying customer that the order is ready for pickup.");
    }
}
