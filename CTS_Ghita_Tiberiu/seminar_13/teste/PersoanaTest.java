package teste;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {
	@Test
    public void testGetRightSexMasculin() {
        Persoana p = new Persoana("Tiberiu", "5020118340456");
        assertEquals("M", p.getSex());
    }

    @Test
    public void testGetRightSexFeminin() {
        Persoana p2 = new Persoana("Maria", "6020118340456");
        assertEquals("F", p2.getSex());
    }

    @Test
    public void testGetBoundaryRightSexMasc() {
        Persoana p = new Persoana("Tiberiu", "1020118340456");
        assertEquals("M", p.getSex());
    }

    @Test
    public void testGetCrossCheckSexMasc() {
        Persoana p = new Persoana("Tiberiu", "2020118340456");
        assertEquals(verificaImpar(p.CNP), p.getSex());
    }

    public String verificaImpar(String CNP) {
        int n = Integer.parseInt(CNP.charAt(0)+ "");
        if(n%2 != 0) {
            return "M";
        } else {
            return "F";
        }
    }


    @Test
    public void testGetSexError() {
        Persoana p = new Persoana("Tiberiu", "9020118340456");
        assertThrows(MyException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                p.getSex();
            }
        });
    }

    @Test
    public void testGetSexPerformamce() {
        Persoana p = new Persoana("Tiberiu", "5020118340456");
        assertTimeout(Duration.ofMillis(100), new Executable() {
            @Override
            public void execute() throws Throwable {
                p.getSex();
            }
        });
    }
}
