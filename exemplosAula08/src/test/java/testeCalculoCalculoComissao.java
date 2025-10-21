import org.junit.Assert;
import org.junit.Test;

public class testeCalculoCalculoComissao {
    @Test
    public void testeComTrintaPorCento(){

        calculoComissao calculoComissao = new calculoComissao();
        calculoComissao.valorVendido = 1000;
        calculoComissao.percentualComissao = 30;

        double valorEsperado = 300.0;

        double valorCalculado = calculoComissao.calcularValorComissao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testeComissaoGuilherme(){
        calculoComissao calculoComissaoGuilherme = new calculoComissao();
        calculoComissaoGuilherme.valorVendido = 2000;
        calculoComissaoGuilherme.percentualComissao = 20;

        double valorEsperadoGuilherme = 400.0;

        double valorCalculadoGuilherme = calculoComissaoGuilherme.calcularValorComissao();

        Assert.assertEquals(valorEsperadoGuilherme, valorCalculadoGuilherme, 0.001);
    }
}
