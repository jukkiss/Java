import java.util.Random;

public class AgeDistributionSimulation {
    public static void main(String[] args) {
        int[][] agedistribution = {
                {16, 20}, {34, 21}, {52, 22}, {68, 23}, {82, 24},
                {89, 25}, {94, 26}, {96, 28}, {98, 30}, {100, 35}
        };

        int[] results = new int[agedistribution[agedistribution.length - 1][1] + 1];

        Random random = new Random();


        for (int i = 0; i < 1000; i++) {
            int randomPct = random.nextInt(100) + 1;
            for (int[] ageInfo : agedistribution) {
                if (randomPct <= ageInfo[0]) {
                    results[ageInfo[1]]++;
                    break;
                }
            }
        }

        System.out.println("Age\tCount");
        for (int age = 0; age < results.length; age++) {
            if (results[age] > 0) {
                System.out.println(age + "\t" + results[age]);
            }
        }
    }
}
