package template.withoutPattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" Order Fulfillment System (WITHOUT Template)");
        System.out.println("==============================================\n");

        StandardDeliveryOrder standardDeliveryOrder = new StandardDeliveryOrder(300.0);
        ExpressDeliveryOrder expressDeliveryOrder = new ExpressDeliveryOrder(300.0);
        SelfPickupOrder selfPickupOrder = new SelfPickupOrder(300.0);

        standardDeliveryOrder.processOrder();
        expressDeliveryOrder.processOrder();
        selfPickupOrder.processOrder();
    }
}
