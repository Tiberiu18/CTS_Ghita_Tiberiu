package seminar09.decorator.clase;

public class DecoratorNotaDePlataLaMultiAni extends Decorator{
    public DecoratorNotaDePlataLaMultiAni(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaNotaDePlata(double totalDePlata) {
        super.printeazaNotaDePlata(totalDePlata);
        System.out.println("La multi ani.");
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani.");
    }

}
