package composite.withpattern;

import java.util.ArrayList;
import java.util.List;

public class Squad implements MilitaryComponent {

    private String name;
    private List<MilitaryComponent> children = new ArrayList<MilitaryComponent>();

    public Squad(String name) {
        this.name = name;
    }

    public void add(MilitaryComponent component) {
        children.add(component);
    }

    public void remove(MilitaryComponent component) {
        children.remove(component);
    }

    public MilitaryComponent getChild(int index) {
        return children.get(index);
    }

    public void attack() {
        System.out.println(name + " delegates the attack command.");
        for (MilitaryComponent child : children) {
            child.attack();
        }
    }

    public void move() {
        System.out.println(name + " delegates the move command.");
        for (MilitaryComponent child : children) {
            child.move();
        }
    }

    public void displayDetails() {
        System.out.println(name);
        for (MilitaryComponent child : children) {
            child.displayDetails();
        }
    }
}
