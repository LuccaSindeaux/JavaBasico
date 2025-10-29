package jogador;

import apetite.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Goleiro extends Jogador {
    private int penaltisDefendidos;

    public Goleiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetite, BigDecimal preco, int penaltisDefendidos){
        super(nome, idade, clubeAtual, reputacaoHistorica, apetite, preco);

        this.penaltisDefendidos = penaltisDefendidos;
    }

    @Override
    public BigDecimal getValorCompra(){
        BigDecimal valorBase = super.getValorCompra();

        BigDecimal percentualAcrescimo = new BigDecimal("0.04").multiply(new BigDecimal(this.penaltisDefendidos));

        BigDecimal valorAcrescimo = valorBase.multiply(percentualAcrescimo);

        BigDecimal valorFinal = valorBase.add(valorAcrescimo);

        return valorFinal;
    }
}
