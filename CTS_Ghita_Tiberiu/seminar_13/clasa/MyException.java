package teste;

public class MyException extends IllegalArgumentException {

	private String mesaj;

    public MyException(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }
}
