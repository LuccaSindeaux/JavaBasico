import org.junit.Test;
import org.junit.Assert;

public class BatalhaTest {
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra(){
        Jutsu jutsuNinjaUm = new Jutsu("satetsuShigure", 7, 4);
        Ninja ninjaUm = new Ninja("Sasori", jutsuNinjaUm);

        Jutsu jutsuNinjaDois =  new Jutsu("katonZukoku", 7, 2);
        Ninja ninjaDois = new Ninja("Kakuzu", jutsuNinjaDois);
    }
    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu("kageBushin", 4, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu("sabakuSouso", 8, 4);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getReservaChakra());
    }
    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu jutsuItachi = new Jutsu("amaterasu", 10, 5);
        Ninja ninjaUm = new Ninja("Itachi", jutsuItachi);

        Jutsu jutsuDois = new Jutsu("senkoudan", 8, 3);
        Ninja ninjaDois = new Ninja("Kisame Hoshikage", jutsuDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);

    }
    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi(){
        Jutsu jutsuUm = new Jutsu("C0Karura", 9, 5);
        Ninja ninjaUm = new Ninja("Deidara", jutsuUm);

        Jutsu jutsuItachi = new Jutsu("amaterasu", 10, 5);
        Ninja ninjaDois = new Ninja("Itachi", jutsuItachi);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaDois, ninjaVencedor);

    }
    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar(){
        Jutsu jutsuUm = new Jutsu("shinraTensei", 10, 5);
        Ninja ninjaUm = new Ninja("Nagato", jutsuUm);

        Jutsu jutsuDois = new Jutsu("kuchioseGamabunta", 10, 5);
        Ninja ninjaDois = new Ninja("Jiraya", jutsuDois);

        Batalha natalha = new Batalha();

        Ninja ninjaVencedor = natalha.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, ninjaVencedor);

    }

}
