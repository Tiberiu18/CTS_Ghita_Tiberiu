package seminar09.decorator.main;

import seminar09.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata = new NotaDePlata("2023-04-25");
        INotaDePlata notaDePlata2 = new NotaDePlata("2023-04-26");

        notaDePlata.printeazaNotaDePlata(250);
        notaDePlata2.printeazaNotaDePlata(400);
        System.out.println();


        Decorator notaDePlataDePaste = new DecoratorNotaDePlataPasteFericit(notaDePlata2);
        notaDePlataDePaste.printeazaNotaDePlata(400);
        notaDePlataDePaste.printeazaFelicitare();
        System.out.println();

        Decorator notaDePlataDeLaMultiAni = new DecoratorNotaDePlataLaMultiAni(notaDePlataDePaste);
        notaDePlataDeLaMultiAni.printeazaNotaDePlata(250);
        //notaDePlataDeLaMultiAni.printeazaFelicitare();
        System.out.println();






    }
}
