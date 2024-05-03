public class SummaLuokkaTesti {
        public static void main(String[] args) {
            int summa = 0;
            int luku = 1;  // Ensimmäinen positiivinen pariton luku

            for (int i = 0; i < 15; i++) {
                summa += luku;
                luku += 2;  // Seuraava pariton luku on aina kaksi yksikköä suurempi
            }

            System.out.println("15 ensimmäisen parittoman luvun summa on: " + summa);
        }
}
