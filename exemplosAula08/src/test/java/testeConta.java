import org.junit.Assert;
import org.junit.Test;

public class testeConta {
    @Test
    public void testeSaque(){
        Conta contaLucca = new Conta();
        contaLucca.saldo = 1000.00;

        double saldoEsperado = 800.00;

        contaLucca.sacar(200);

        Assert.assertEquals(saldoEsperado, contaLucca.saldo, 0.01);
    }

    @Test
    public void testeDeposito(){
        Conta contaLucca = new Conta();
        contaLucca.saldo = 1000.00;

        double saldoEsperado = 1200.00;

        contaLucca.depositar(200);

        Assert.assertEquals(saldoEsperado, contaLucca.saldo, 0.01);
    }
}
