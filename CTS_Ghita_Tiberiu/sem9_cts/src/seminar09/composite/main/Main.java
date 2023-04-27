package seminar09.composite.main;

import seminar09.composite.clase.Item;
import seminar09.composite.clase.Produs;
import seminar09.composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Item meniu = new Sectiune("Meniu Restaurant");


        Item sectiuneBauturi = new Sectiune("Bauturi");
        Item sectiuneStartere = new Sectiune("Startere");

        //subsectiuni
        Item subsectiuneCafele = new Sectiune("Cafele");
        Item subsectiuneSucuri = new Sectiune("Sucuri");

        //Produse
        Item produsCafeaNeagra = new Produs("Cafea Neagra");
        Item produsCafeaAlba = new Produs("Cafea Alba");

        Item produsCocaCola = new Produs("Coca Cola");
        Item produsPepsi = new Produs("Pepsi");

        Item produsApaPlata = new Produs("Apa plata");

        Item bruschete = new Produs("Bruschete");

        try{
            subsectiuneCafele.adaugareItem(produsCafeaNeagra);
            subsectiuneCafele.adaugareItem(produsCafeaAlba);
            subsectiuneSucuri.adaugareItem(produsCocaCola);
            subsectiuneSucuri.adaugareItem(produsPepsi);

            sectiuneBauturi.adaugareItem(subsectiuneCafele);
            sectiuneBauturi.adaugareItem(subsectiuneSucuri);

            sectiuneBauturi.adaugareItem(produsApaPlata);

            sectiuneStartere.adaugareItem(bruschete);
            meniu.adaugareItem(sectiuneBauturi);
            meniu.adaugareItem(sectiuneStartere);
            meniu.descriere("");


        }
        catch(Exception ex){
            ex.getMessage();
        }




    }
}
