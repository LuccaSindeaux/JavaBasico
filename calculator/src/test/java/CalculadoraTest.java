import org.junit.Assert;
import org.junit.Test;

public class testeCalculadora {
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        // Arrange
        double valorA = 4;
        double valorB = 2;
        double resultadoEsperadoSoma = 6;

        Calculadora calculadoraSoma = new Calculadora();
        // Act
        double resultadoSoma = calculadoraSoma.somar(valorA, valorB);

        // Assert
        Assert.assertEquals(resultadoEsperadoSoma, resultadoSoma, 0);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        // Arrange
        double valorA = 4;
        double valorB = 2;
        double resultadoEsperadoDivisaoInteiros = 2;

        Calculadora calcularDivisaoInteiros = new Calculadora();

        // ACt
        double resultadoDivisaoInteiros = calcularDivisaoInteiros.dividir(valorA, valorB);

        // Assert
        Assert.assertEquals(resultadoEsperadoDivisaoInteiros, resultadoDivisaoInteiros, 0);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        // Arrange
        double valorA = 4;
        double valorB = 2;
        double resultadoEsperadoMultiplicacaoInteiros = 8;

        Calculadora calculadorMultiplicacaoInteiros = new Calculadora();

        // Act
        double resultadoMultiplicacaoInteiros = calculadorMultiplicacaoInteiros.multiplicar(valorA, valorB);

        // Assert
        Assert.assertEquals(resultadoEsperadoMultiplicacaoInteiros, resultadoMultiplicacaoInteiros, 0);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        // Arrange
        double valorA = 4.8;
        double valorB = 2.4;
        double resultadoEsperadoDivisaoFloats = 2;

        Calculadora calculadorDivisaoFloats = new Calculadora();

        // Act
        double resultadoDivisaoFloats = calculadorDivisaoFloats.dividir(valorA, valorB);

        // Assert
        Assert.assertEquals(resultadoEsperadoDivisaoFloats, resultadoDivisaoFloats, 0.01);
    }

    // testes que não foram pedidos
    @Test
    public void deveSubtrairCorretamenteQuandoNumerosForemInteiros(){
        // Arrange
        double valorA = 6;
        double valorB = 8;
        double resultadoEsperadoSubtracao = -2;

        Calculadora calcularSubtracaoDeInteiros = new Calculadora();

        // Act
        double resultadoSubtracaoInteiros = calcularSubtracaoDeInteiros.subtrair(valorA, valorB);

        // Assert
        Assert.assertEquals(resultadoEsperadoSubtracao, resultadoSubtracaoInteiros, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoNumerosForemFlutuantes(){
        // arrange
        double valorA = 6.5;
        double valorB = 1.3;
        double resultadoEsperadoSubtracaoFlutuantes = 5.2;

        Calculadora calcularSubtracaoFlutuantes = new Calculadora();

        // Act
        double resultadoSubtracaoFlutuantes = calcularSubtracaoFlutuantes.subtrair(valorA, valorB);

        // Assert
        Assert.assertEquals(resultadoEsperadoSubtracaoFlutuantes, resultadoSubtracaoFlutuantes,0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteFlutuantes(){
        // Arrange
        double valorA = 1.5;
        double valorB = 3;
        double valorEsperadoMultiplicacaoFlutuantes = 4.5;

        Calculadora calcularMultiplicacaoFlutuantes = new Calculadora();

        // Act
        double resultadoMultiplicacaoFlutuantes = calcularMultiplicacaoFlutuantes.multiplicar(valorA, valorB);

        // Assert
        Assert.assertEquals(resultadoMultiplicacaoFlutuantes, resultadoMultiplicacaoFlutuantes, 0.01);
    }

    // Desafio 1
    @Test
    public void deveExponenciarCorretamente(){
        // arrange
        double valorA = 6;
        double resultadoEsperadoExponenciacao = 36;

        Calculadora calularExponenciacao = new Calculadora();

        // act
        double resultadoExponenciacao = calularExponenciacao.exponenciar(valorA);

        //Assert
        Assert.assertEquals(resultadoEsperadoExponenciacao, resultadoExponenciacao, 0.01);
    }

    @Test
    public void deveCorretamenteTirarRaizQuadrada(){
        // Arrange
        double valorA = 144;
        double resultadoEsperadoRaizQuadrada = 12;

        Calculadora calcularRaizQuadrada = new Calculadora();

        // Act
        double resultadoRaizQuadrada = calcularRaizQuadrada.tirarRaizQuadrada(valorA);

        // Assert
        Assert.assertEquals(resultadoEsperadoRaizQuadrada, resultadoRaizQuadrada, 0.01);
    }
}
