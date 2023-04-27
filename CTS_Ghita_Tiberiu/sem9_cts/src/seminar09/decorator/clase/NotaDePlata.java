package seminar09.decorator.clase;

public class NotaDePlata implements INotaDePlata {
    private String dataEmiterii;

    public NotaDePlata(String dataEmiterii){
        this.dataEmiterii = dataEmiterii;
    }
    @Override
    public void printeazaNotaDePlata(double totalDePlata) {
        System.out.println("Nota dumneavoastra de plata din " + this.dataEmiterii + "  este in valaore de " + totalDePlata + " lei.");
    }
}
