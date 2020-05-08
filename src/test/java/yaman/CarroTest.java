package yaman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarroTest {

    private static final String CARRO_COR = "preto";
    private static final String CARRO_MODELO = "Fusca";
    private static final Double CARRO_VELOCIDADE_MAXIMO = 160d;
    private static final Boolean CARRO_DESLIGADO = false;

    private static Carro carro;

    @BeforeAll
    public static void setup() {
        carro = new Carro(CARRO_COR, CARRO_MODELO, CARRO_VELOCIDADE_MAXIMO);
    }

    @Test
    public void carroLigar() {
        carro.ligaedesliga();
        Assertions.assertEquals(!CARRO_DESLIGADO, carro.getLigado());
    }

    @Test
    public void carroVelocidade() {
        double velocidade = 10d;
        carro.acelera(velocidade);
        Assertions.assertEquals(velocidade, carro.getVelocidadeAtual());
        Assertions.assertEquals(true, carro.getVelocidadeAtual() < carro.getVelocidadeMaxima());
    }

    @Test
    public void carroTestaMarcha() {
        carro.acelera(-20d);
        Assertions.assertEquals(-1, carro.pegaMarcha());

        carro.acelera(20d);
        Assertions.assertEquals(1, carro.pegaMarcha());

        carro.acelera(50d);
        Assertions.assertEquals(2, carro.pegaMarcha());

        carro.acelera(50d);
        Assertions.assertEquals(3, carro.pegaMarcha());

    }
}
