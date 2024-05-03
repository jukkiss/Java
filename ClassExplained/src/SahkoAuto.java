public class SahkoAuto extends Auto {
    private double akunKapasiteetti;

    public SahkoAuto(String merkki, String malli, int vuosimalli, double akunKapasiteetti) {
        super(merkki, malli, vuosimalli);
        this.akunKapasiteetti = akunKapasiteetti;
    }

    @Override
    public void naytaTiedot() {
        super.naytaTiedot();
        System.out.println("Akun kapasiteetti: " + akunKapasiteetti + " kwh");
    }

    public double getAkunKapasiteetti() {
        return akunKapasiteetti;
    }

    public void setAkunKapasiteetti(double akunKapasiteetti) {
        this.akunKapasiteetti = akunKapasiteetti;


    }
}