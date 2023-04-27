package seminar09.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
    private List<Integer> meseDebarasate;

    public Ospatar() {
        this.meseDebarasate = new ArrayList<>();
    }

    public boolean esteMasaDebarasata(int nrMasa){
        return meseDebarasate.contains(nrMasa);
    }

    public void debaraseazaMasa(int nrMasa){
        meseDebarasate.add(nrMasa);

    }
}
