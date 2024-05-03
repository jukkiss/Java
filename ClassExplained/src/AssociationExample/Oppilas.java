package AssociationExample;

public class Oppilas {
    private Opettaja opettaja;  // Jokaisella oppilaalla on yksi opettaja

    public Oppilas(Opettaja opettaja) {
        this.opettaja = opettaja;
    }

    public Opettaja getOpettaja() {
        return this.opettaja;
    }
}
