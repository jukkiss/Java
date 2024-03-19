import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        final double grammatPerLuoti = 13.28;
        final int luotiPerNaula = 32;
        final int naulaPerLeiviska = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Paino grammoina: ");
        double grammat = Double.parseDouble(scanner.nextLine());


        double totalLuodit = grammat / grammatPerLuoti;

        int leiviskat = (int)totalLuodit / (luotiPerNaula * naulaPerLeiviska);

        int naulas = (int)(totalLuodit % (luotiPerNaula * naulaPerLeiviska)) / luotiPerNaula;

        double remainingGramsForLuodit = grammat - (leiviskat * naulaPerLeiviska * luotiPerNaula * grammatPerLuoti) - (naulas * luotiPerNaula * grammatPerLuoti);

        double LopullisetLuodit = remainingGramsForLuodit / grammatPerLuoti;

        System.out.printf("%d grammaa on %d leiviskää, %d naulaa ja %.2f luotia.%n",
                (int)grammat, leiviskat, naulas, LopullisetLuodit);
    }
}
