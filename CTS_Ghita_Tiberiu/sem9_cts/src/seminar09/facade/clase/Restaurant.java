package seminar09.facade.clase;

public class Restaurant {

    private MeseRestaurant meseRestaurant;
    private Ospatar ospatar;

    public Restaurant() {
        meseRestaurant = new MeseRestaurant();
        meseRestaurant.adaugareMasa(new Masa(true, true, 1));
        meseRestaurant.adaugareMasa(new Masa(true, false, 2));
        meseRestaurant.adaugareMasa(new Masa(false, false, 3));
        meseRestaurant.adaugareMasa(new Masa(false, true, 4));
        ospatar = new Ospatar();
        ospatar.debaraseazaMasa(1);
        ospatar.debaraseazaMasa(2);
    }

    public String verificareDisponibilitateMasa(int nrMasa){
        if (meseRestaurant.esteLibera(nrMasa)){
            if(ospatar.esteMasaDebarasata(nrMasa) && meseRestaurant.suntServeteleNoi(nrMasa))
                return "Masa este libera si puteti lua loc";
            else{
                return "Masa este libera, asteptati sa fie debarasata";
            }
        }
        else{
            return "Masa nu este disponibila momentan";
        }
    }


}
