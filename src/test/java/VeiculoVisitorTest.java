import org.example.Caminhao;
import org.example.Carro;
import org.example.Onibus;
import org.example.VeiculoVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VeiculoVisitorTest {

    @Test
    public void deveExibirCarro() {
        Carro carro = new Carro(2018, 4, "prata");

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{ano=2018, cor='prata', numero de rodas=4}", visitor.exibir(carro));
    }

    @Test
    public void deveExibirOnibus() {
        Onibus onibus = new Onibus(2015, 6, "azul", 50);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Onibus{ano=2015, numero de rodas=6, cor='azul', numero de assentos=50}", visitor.exibir(onibus));
    }

    @Test
    public void deveExibirCaminhao() {
        Caminhao caminhao = new Caminhao(2016, 8, "branco", 1);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Caminhao{ano=2016, numero de rodas=8, cor='branco', numero de eixos=1}", visitor.exibir(caminhao));
    }
}
