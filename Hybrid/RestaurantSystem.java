class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Chef " + getName() + " (ID: " + getId() + ") is preparing meals.");
    }
}
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter " + getName() + " (ID: " + getId() + ") is serving customers.");
    }
}
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Emma", 202);
        chef.performDuties();
        waiter.performDuties();
    }
}
