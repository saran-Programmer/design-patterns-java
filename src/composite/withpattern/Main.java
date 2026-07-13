package composite.withpattern;

public class Main {

    public static void main(String[] args) {
        Squad alphaSquad = new Squad("Alpha Squad");
        alphaSquad.add(new InfantrySoldier());
        alphaSquad.add(new Sniper());
        alphaSquad.add(new Medic());

        Squad bravoSquad = new Squad("Bravo Squad");
        bravoSquad.add(new InfantrySoldier());
        bravoSquad.add(new Engineer());

        Squad charlieSquad = new Squad("Charlie Squad");
        charlieSquad.add(new InfantrySoldier());
        charlieSquad.add(new InfantrySoldier());

        Squad taskForceNorth = new Squad("Task Force North");
        taskForceNorth.add(alphaSquad);
        taskForceNorth.add(bravoSquad);

        Squad mainBattalion = new Squad("Main Battalion");
        mainBattalion.add(taskForceNorth);
        mainBattalion.add(charlieSquad);

        General general = new General();

        System.out.println("=== Military Hierarchy (With Composite) ===");
        general.requestDetails(mainBattalion);

        System.out.println("\n=== Attack ===");
        general.commandAttack(mainBattalion);

        System.out.println("\n=== Move ===");
        general.commandMove(mainBattalion);
    }
}
