package factory.withoutPattern;

public class MonsterSpawner {

    public Monster spawnMonster(String zone, String timeOfDay) {

        if (zone.equals("Forest") && timeOfDay.equals("Day")) {
            return new Monster("Bandits", 60, 12, 3, 6);
        } else if (zone.equals("Forest") && timeOfDay.equals("Night")) {
            return new Monster("Angry Spirits", 40, 18, 5, 8);
        } else if (zone.equals("Ocean") && timeOfDay.equals("Day")) {
            return new Monster("Pirates", 70, 15, 4, 7);
        } else if (zone.equals("Ocean") && timeOfDay.equals("Night")) {
            return new Monster("Leviathan", 200, 40, 2, 10);
        } else if (zone.equals("Cave") && timeOfDay.equals("Day")) {
            return new Monster("Cavemen", 80, 14, 2, 5);
        } else if (zone.equals("Cave") && timeOfDay.equals("Night")) {
            return new Monster("Banished Army Soldiers", 100, 22, 3, 6);
        } else if (zone.equals("Mountain") && timeOfDay.equals("Day")) {
            return new Monster("Wolves", 50, 16, 6, 9);
        } else if (zone.equals("Mountain") && timeOfDay.equals("Night")) {
            return new Monster("Frost Giants", 250, 35, 2, 8);
        }

        throw new IllegalArgumentException("No monster configured for zone: " + zone + ", time: " + timeOfDay);
    }
}
