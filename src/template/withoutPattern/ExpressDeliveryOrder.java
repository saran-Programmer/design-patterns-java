    package template.withoutPattern;

public class ExpressDeliveryOrder {

    private double orderAmount;
    private double deliveryFee;
    private double finalPrice;

    public ExpressDeliveryOrder(double orderAmount) {
        this.orderAmount = orderAmount;
        this.deliveryFee = 90.0;
    }

    public void processOrder() {
        System.out.println("Processing Express Delivery Order");
        validateOrder();
        prepareOrder();
        calculateFinalPrice();
        processPayment();
        arrangeDelivery();
        notifyCustomer();
        System.out.println();
    }

    private void validateOrder() {
        System.out.println("1. Validating express delivery order.");
    }

    private void prepareOrder() {
        System.out.println("2. Preparing food quickly for express delivery.");
    }

    private void calculateFinalPrice() {
        finalPrice = orderAmount + deliveryFee;
        System.out.println("3. Calculating final price with express delivery fee: Rs. " + finalPrice);
    }

    private void processPayment() {
        System.out.println("4. Processing payment of Rs. " + finalPrice + " for express delivery order.");
    }

    private void arrangeDelivery() {
        System.out.println("5. Assigning a high-priority delivery partner.");
    }

    private void notifyCustomer() {
        System.out.println("6. Notifying customer after assigning the high-priority delivery partner.");
    }
}
