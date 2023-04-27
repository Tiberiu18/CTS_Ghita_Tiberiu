package seminar09.facade.main;

import seminar09.facade.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        System.out.println(restaurant.verificareDisponibilitateMasa(2));
        System.out.println(restaurant.verificareDisponibilitateMasa(4));
        System.out.println(restaurant.verificareDisponibilitateMasa(1));
        System.out.println(restaurant.verificareDisponibilitateMasa(3));


    }
}
