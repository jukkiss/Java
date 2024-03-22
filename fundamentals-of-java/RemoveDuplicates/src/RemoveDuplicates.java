import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] originalArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter integer " + (i + 1) + ": ");
            originalArray[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] noDuplicatesArray = removeDuplicates(originalArray);

        System.out.println("The array without duplicates:");
        for (int i = 0; i < noDuplicatesArray.length; i++) {
            if (noDuplicatesArray[i] != 0 || (noDuplicatesArray[i] == 0 && contains(originalArray, 0))) {
                System.out.print(noDuplicatesArray[i] + " ");
            }
        }
    }

    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        int[] tempArray = new int[array.length];
        int j = 0;

        for (int value : array) {
            if (seen.add(value)) {
                tempArray[j++] = value;
            }
        }
        return tempArray;
    }

    public static boolean contains(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
