package template.withoutPattern;

public class StandardDeliveryOrder {

    private double orderAmount;
    private double deliveryFee;
    private double finalPrice;

    public StandardDeliveryOrder(double orderAmount) {
        this.orderAmount = orderAmount;
        this.deliveryFee = 40.0;
    }

    public void processOrder() {
        System.out.println("Processing Standard Delivery Order");
        validateOrder();
        prepareOrder();
        calculateFinalPrice();
        processPayment();
        arrangeDelivery();
        notifyCustomer();
        System.out.println();
    }

    private void validateOrder() {
        System.out.println("1. Validating standard delivery order.");
    }

    private void prepareOrder() {
        System.out.println("2. Preparing food for standard delivery.");
    }

    private void calculateFinalPrice() {
        finalPrice = orderAmount + deliveryFee;
        System.out.println("3. Calculating final price with standard delivery fee: Rs. " + finalPrice);
    }

    private void processPayment() {
        System.out.println("4. Processing payment of Rs. " + finalPrice + " for standard delivery order.");
    }

    private void arrangeDelivery() {
        System.out.println("5. Assigning a regular delivery partner.");
    }

    private void notifyCustomer() {
        System.out.println("6. Notifying customer after assigning the regular delivery partner.");
    }
}
