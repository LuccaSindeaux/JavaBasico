import org.junit.Assert;
import org.junit.Test;

public class ContaTest {
    @Test
    public void deveAtializarSaldoQuandoSacar(){
        Conta contaLucca = new Conta(8574);
        contaLucca.depositar(1000.00);

        double saldoEsperado = 800.00;

        contaLucca.sacar(200);

        Assert.assertEquals(saldoEsperado, contaLucca.getSaldo(), 0.01);
    }

    @Test
    public void deveImpedirSaquesQueDeixaramContaComSaldoNegativo(){
        Conta contaLucca = new Conta(8574);
        contaLucca.depositar(6000.00);

        boolean foiPossivelSacar = contaLucca.sacar(7000.00);

        Assert.assertFalse(foiPossivelSacar);

    }

    @Test
    public void deveAtualizarSaldoQuandoDepositar(){
        Conta contaLucca = new Conta(8574);
        contaLucca.depositar(1000.00);

        double saldoEsperado = 1200.00;

        contaLucca.depositar(200);

        Assert.assertEquals(saldoEsperado, contaLucca.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarSaldoQuandoTransferir(){
        // arrange
        Conta contaLucca = new Conta(8574);
        contaLucca.depositar(1000.00);

        Conta contaJose = new Conta(4811);
        contaJose.depositar(800.00);

        double saldoEsperadoOrigem = 700.00;

        // Act
        contaLucca.transferir(contaJose, 300.00);

        // Assert
        Assert.assertEquals(saldoEsperadoOrigem, contaLucca.getSaldo(), 0.01);
    }
}
