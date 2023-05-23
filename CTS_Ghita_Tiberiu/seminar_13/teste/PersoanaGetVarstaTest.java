package teste;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaGetVarstaTest {

	@Test
    public void getVarstaRightTest() {
        Persoana p = new Persoana("Tiberiu", "5020118340456");
        assertEquals(21, p.getVarsta());
    }

    @Test
    public void getVarstaBoundaryNouNascutTest() {
        Persoana p = new Persoana("Tiberiu", "5230521340456");
        assertEquals(0,p.getVarsta());
    }

    @Test
    public void getVarstaBoundaryAnul2000() {
        Persoana p = new Persoana("Tiberiu", "5000101340456");
        assertEquals(23,p.getVarsta());
    }

    @Test
    public void getVarstaBoundaryAnul1900() {
        Persoana p = new Persoana("Tiberiu", "1000101340456");
        assertEquals(123,p.getVarsta());
    }

    @Test
    public void getVarstaBoundaryAnul1999() {
        Persoana p = new Persoana("Ana", "2991231234567");
        assertEquals(23,p.getVarsta());
    }

    @Test
    public void getVarstaException() {
        Persoana p = new Persoana("Tiberiu", "5230524340456");
        assertThrows(MyException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                p.getVarsta();
            }
        });
    }

    @Test
    public void testGetVarstaTime() {
        Persoana p = new Persoana("Tiberiu", "5020118340456");
        assertTimeout(Duration.ofMillis(100), new Executable() {
            @Override
            public void execute() throws Throwable {
                p.getVarsta();
            }
        });
    }
}
