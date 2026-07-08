package template.withpattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" Order Fulfillment System (WITH Template)");
        System.out.println("============================================\n");

        DeliveryManagementService standardDeliveryService = new StandardDeliveryService(300.0);
        DeliveryManagementService expressDeliveryService = new ExpressDeliveryService(300.0);
        DeliveryManagementService selfPickupService = new SelfPickupService(300.0);

        System.out.println("Standard Delivery Order");
        standardDeliveryService.processOrder();

        System.out.println("Express Delivery Order");
        expressDeliveryService.processOrder();

        System.out.println("Self Pickup Order");
        selfPickupService.processOrder();
    }
}
