class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("Alice", 25);
        Person copiedPerson = new Person(originalPerson);

        originalPerson.displayDetails();
        copiedPerson.displayDetails();
    }
}
