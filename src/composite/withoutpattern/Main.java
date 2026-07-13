package composite.withoutpattern;

public class Main {

    public static void main(String[] args) {
        MainBattalion mainBattalion = new MainBattalion();
        General general = new General();

        System.out.println("=== Military Hierarchy (Without Composite) ===");
        mainBattalion.displayDetails();

        System.out.println("\n=== General's Command ===");
        general.commandMainBattalion(mainBattalion);
    }
}
