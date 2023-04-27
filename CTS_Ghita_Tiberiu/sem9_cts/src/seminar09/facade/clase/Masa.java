package seminar09.facade.clase;

public class Masa {
    private boolean masaLibera;

    private Boolean areServetele;

    public Boolean getAreServetele() {
        return areServetele;
    }

    public void setAreServetele(Boolean areServetele) {
        this.areServetele = areServetele;
    }

    private int nrMasa;

    public Masa(boolean masaLibera, Boolean areServetele, int nrMasa) {
        this.masaLibera = masaLibera;
        this.areServetele = areServetele;
        this.nrMasa = nrMasa;
    }

    public boolean isMasaLibera() {
        return masaLibera;
    }

    public void setMasaLibera(boolean masaLibera) {
        this.masaLibera = masaLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }
}
