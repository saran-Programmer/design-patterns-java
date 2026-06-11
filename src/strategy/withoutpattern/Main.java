package strategy.withoutpattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("      Welcome to the Car Showroom     ");
        System.out.println("======================================\n");

        Car sportsCar = new SportsCar();
        Car offRoadCar = new OffRoadCar();
        Car sedanCar = new SedanCar();

        sportsCar.display();
        offRoadCar.display();
        sedanCar.display();

        sportsCar.drive();
        offRoadCar.drive();
        sedanCar.drive();
    }
}
