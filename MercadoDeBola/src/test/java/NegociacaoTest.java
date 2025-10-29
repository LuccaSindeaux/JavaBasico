import negociacao.Negociacao;

import apetite.Conservador;
import apetite.Indiferente;
import apetite.Mercenario;

import clube.Clube;

import jogador.Jogador;
import jogador.Zagueiro;
import jogador.Lateral;
import jogador.Atacante;
import jogador.Goleiro;
import jogador.MeioCampo;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/*
* deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa
   naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua
naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel
deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos
deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos
* */

public class NegociacaoTest {

    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa(){
        // arrange
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Grêmio", 10, new BigDecimal("100000000"));
        Jogador goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, new Indiferente(), new BigDecimal("800500"), 12);

        //act
        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        // assert
        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, new BigDecimal("100000000"));
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 10, new Conservador(), new BigDecimal("800500"), 20);

        boolean foiPossivelNegoicar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegoicar);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel(){
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Palmeiras", 8, new BigDecimal("1000000"));
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, new Indiferente(), new BigDecimal("100000000"),12);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos(){
        Negociacao negociacao = new Negociacao();
        MeioCampo meioCampo = new MeioCampo("Zidane", 25, null, 10, new Indiferente(), new BigDecimal("1000000"));

        BigDecimal precoEsperado = new BigDecimal(("1000000"));

        BigDecimal precoCalculcado = meioCampo.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculcado));
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos(){
        MeioCampo meioCampoVeterano = new MeioCampo("Zidane", 31, null, 10, new Indiferente(), new BigDecimal("1000000"));

        BigDecimal precoEsperado = new BigDecimal("700000");
        BigDecimal precoCalculado = meioCampoVeterano.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculado));
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoLateralComMenosDeVinteOitoAnos(){
        Lateral lateralJovem = new Lateral("Cafu", 25, null, 10, new Indiferente(), new BigDecimal("1000000"), 10);

        BigDecimal precoEsperado = new BigDecimal("1200000");

        BigDecimal precoCalculado = lateralJovem.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculado));
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoLateralComMaisDeVinteOitoAnos(){
        Lateral lateralVeterano = new Lateral("Cafu", 29, null, 10, new Indiferente(), new BigDecimal("1000000"), 10);

        BigDecimal precoEsperado = new BigDecimal("840000");

        BigDecimal precoCalculado = lateralVeterano.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculado));
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoZagueiroComMenosDeTrintaAnos(){
        Zagueiro zagueiroJovem = new Zagueiro("Maldini", 29, null, 10, new Indiferente(), new BigDecimal("1000000"));

        BigDecimal precoEsperado = new BigDecimal("1000000");

        BigDecimal precoCalculado = zagueiroJovem.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculado));

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoZaguieroComMaisDeTrintaAnos(){
        Zagueiro zagueiroVeterano = new Zagueiro("Maldini", 31, null, 10, new Indiferente(), new BigDecimal("1000000"));

        BigDecimal precoEsperado = new BigDecimal("800000");

        BigDecimal precoCalculado = zagueiroVeterano.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculado));
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoApetiteConservador(){
        Zagueiro zagueiro = new Zagueiro("Gamarra", 29, null, 9, new Conservador(), new BigDecimal("1000000"));

        BigDecimal precoEsperado = new BigDecimal("1400000");

        BigDecimal precoCalculado = zagueiro.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculado));
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoApetiteMercenario(){
        Zagueiro zagueiro = new Zagueiro("Gamarra", 29, null, 9, new Mercenario(), new BigDecimal("1000000"));

        BigDecimal precoEsperado = new BigDecimal("1800000");

        BigDecimal precoCalculado = zagueiro.getValorCompra();

        Assert.assertEquals(0, precoEsperado.compareTo(precoCalculado));
    }

}