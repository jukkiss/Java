package ComparingObjects;

public class AutoKaksi {
    private String merkki;
    private String malli;
    private int vuosimalli;

    // Oletuskonstruktori
    public AutoKaksi() {
        // Oletusarvot esimerkin vuoksi
        this.merkki = "Toyota";
        this.malli = "Corolla";
        this.vuosimalli = 2022;
    }

    // Getterit (jos tarvitset)
    public String getMerkki() {
        return merkki;
    }

    public String getMalli() {
        return malli;
    }

    public int getVuosimalli() {
        return vuosimalli;
    }

    // Ylikirjoitetaan Object-luokan equals-metodi
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Sama viite
        if (obj == null || getClass() != obj.getClass()) return false; // Ei samaa luokkaa tai obj on null
        AutoKaksi auto = (AutoKaksi) obj;
        return vuosimalli == auto.vuosimalli &&
                merkki.equals(auto.merkki) &&
                malli.equals(auto.malli);
    }
}
