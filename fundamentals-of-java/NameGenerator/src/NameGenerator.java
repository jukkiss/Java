import java.util.Scanner;
import java.util.Random;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {"Jukka", "Janne", "Anne", "Saara", "Mikko", "Emilia"};
        String[] lastNames = {"Santala", "Jaakkola", "Virtanen", "Mikkonen", "Viimeinen", "Vielayksi"};

        System.out.println("How many random names we make? ");
        int numberOfNames = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfNames; i++) {
            int firstNameIndex = random.nextInt(firstNames.length);
            int lastNameIndex = random.nextInt(lastNames.length);

            String fullName = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];

            System.out.println(fullName);
        }
    }
}
