package seminar09.facade.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeseRestaurant {

    private Map<Integer,Masa> listaMese;

    public MeseRestaurant() {
        listaMese = new HashMap<>();
    }


    public void adaugareMasa(Masa masa){
        listaMese.put(masa.getNrMasa(), masa);
    }

    public Boolean esteLibera(int nrMasa) {
        return listaMese.get(nrMasa).isMasaLibera();
    }

    public Boolean suntServeteleNoi(int nrMasa){
        return listaMese.get(nrMasa).getAreServetele();

    }

}
