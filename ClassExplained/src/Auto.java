// Tämä on Auto-luokka, joka kuvaa auton perusominaisuuksia ja toimintoja.
public class Auto {

    // Attribuutit: Luokan muuttujat eli auton perustiedot.
    private String merkki; // Auton merkki, esim. Toyota.
    private String malli; // Auton malli, esim. Corolla.
    private int vuosimalli; // Auton valmistusvuosi.
    private boolean onkoKaynnissa; // Tieto siitä, onko auto käynnissä.

    // Konstruktori: Kutsutaan, kun luodaan uusi Auto-olio.
    // Asettaa autolle merkin, mallin ja vuosimallin.
    public Auto(String merkki, String malli, int vuosimalli) {
        this.merkki = merkki;
        this.malli = malli;
        this.vuosimalli = vuosimalli;
        this.onkoKaynnissa = false; // Oletuksena auto ei ole käynnissä.
    }

    // Ylikirjoitetaan toString-metodi
    @Override
    public String toString() {
        return "Merkki: " + merkki + ", Malli: " + malli + ", Vuosimalli: " + vuosimalli;
    }

    // Metodi käynnistää auton.
    public void kaynnista() {
        onkoKaynnissa = true;
        System.out.println(merkki + " " + malli + " on nyt käynnissä.");
    }

    // Metodi pysäyttää auton.
    public void pysayta() {
        onkoKaynnissa = false;
        System.out.println(merkki + " " + malli + " on nyt pysäytetty.");
    }

    // Metodi tulostaa auton tiedot.
    public void naytaTiedot() {
        System.out.println("Merkki: " + merkki + ", Malli: " + malli + ", Vuosimalli: " + vuosimalli);
    }

    // Getterit ja Setterit: Metodit attribuuttien lukemiseen ja muuttamiseen.
    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {
        this.vuosimalli = vuosimalli;
    }

    public boolean isOnkoKaynnissa() {
        return onkoKaynnissa;
    }

    // Ei tarvita setteriä onkoKaynnissa-muuttujalle, koska sitä hallitaan kaynnista ja pysayta metodeilla.

}

