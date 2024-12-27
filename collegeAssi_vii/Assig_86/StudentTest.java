class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int marks;

    public Student(String name, int marks) throws MarksOutOfBoundException {
        if (marks > 100) {
            throw new MarksOutOfBoundException("Marks cannot be greater than 100");
        }
        this.name = name;
        this.marks = marks;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Alice", 105);
        } catch (MarksOutOfBoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
