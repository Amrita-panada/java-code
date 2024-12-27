interface PersonInterface {
    void display();
    int count();
}

class Person implements PersonInterface {
    static int maxCount = 100;
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
    }

    @Override
    public int count() {
        return name.length();
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        p.display();
        System.out.println("Character Count: " + p.count());
    }
}
