package yaman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MotoTest {

    private static Moto moto;

    @BeforeAll
    public static void setup() {
        moto = new Moto("azul", 150d, true, 2010,
                "fazer", "yamaha", 160d);
    }

    @Test
    public void motoSetup() {
        Assertions.assertEquals("azul", moto.getCor());
        Assertions.assertEquals(true, moto.isAutomatica());
        Assertions.assertEquals(2010, moto.getAno());
        Assertions.assertEquals("fazer", moto.getModelo());
        Assertions.assertEquals("yamaha", moto.getFabricante());
        Assertions.assertEquals(160d, moto.getVelocidadeMaxima());
    }

    @Test
    public void motogetMarcha() {
        Assertions.assertEquals(0, moto.getMarcha());
        moto.acelerar(10);
        Assertions.assertEquals(1, moto.getMarcha());
        moto.acelerar(20);
        Assertions.assertEquals(2, moto.getMarcha());
        moto.acelerar(15);
        Assertions.assertEquals(3, moto.getMarcha());
        moto.acelerar(30);
        Assertions.assertEquals(4, moto.getMarcha());
        moto.acelerar(20);
        Assertions.assertEquals(5, moto.getMarcha());
        moto.acelerar(20);
        Assertions.assertEquals(6, moto.getMarcha());
        moto.acelerar(80);
        Assertions.assertEquals(7, moto.getMarcha());
    }

}
