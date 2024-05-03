
package ComparingObjects;

public class ComparingObjects {
    public static void main(String[] args) {
        AutoKaksi myCar = new AutoKaksi();
        AutoKaksi yourCar = new AutoKaksi();
        // Tässä kohtaa, koska molemmilla AutoKaksi-olioilla on samat oletusarvot, equals-metodi palauttaa true.
        myCar = yourCar; // myCar viittaa nyt samaan objektiin kuin yourCar

        if (myCar.equals(yourCar)) {
            System.out.println("Autot ovat samat.");
        } else {
            System.out.println("Autot eivät ole samat.");
        }
    }
}
