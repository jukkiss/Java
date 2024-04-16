import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", 20);
        Course course = new Course("CS101", "Introduction to Programming", "Jane Smith");
        Enrollment enrollment = new Enrollment(student, course, "2024-01-01");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            out.writeObject(enrollment);
            System.out.println("Enrollment serialized successfully.");
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment savedEnrollment = (Enrollment) in.readObject();
            System.out.println("Deserialized Enrollment:");
            System.out.println("Student: " + savedEnrollment.getStudent().getName() +
                    ", Course: " + savedEnrollment.getCourse().getCourseName() +
                    ", Date: " + savedEnrollment.getEnrollmentDate());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e);
        }
    }
}
