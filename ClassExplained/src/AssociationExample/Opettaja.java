package AssociationExample;

import java.util.List;
import java.util.ArrayList;

public class Opettaja {
    private List<Oppilas> oppilaat;  // Opettajalla on lista oppilaita

    public Opettaja() {
        this.oppilaat = new ArrayList<>();
    }

    public void lisaaOppilas(Oppilas oppilas) {
        this.oppilaat.add(oppilas);
    }

    public List<Oppilas> getOppilaat() {
        return this.oppilaat;
    }
}
