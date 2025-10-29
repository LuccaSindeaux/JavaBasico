package jogador;

import apetite.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Atacante extends Jogador {
    private int golsNoAno;

    public Atacante(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetite, BigDecimal preco, int golsNoAno){
        super(nome, idade, clubeAtual, reputacaoHistorica, apetite, preco);
        this.golsNoAno = golsNoAno;
    }

    public boolean temInteresse(Clube clubeInteressado){
        return clubeInteressado.getReputacaoHistorica() > this.reputacaoHistorica;
    }

    @Override
    public BigDecimal getValorCompra(){
        // RN06
        BigDecimal valorBase = super.getValorCompra();

        BigDecimal percentualGols = new BigDecimal("0.01").multiply(new BigDecimal(this.golsNoAno));

        BigDecimal acrescimoGols = valorBase.multiply(percentualGols);

        BigDecimal valorComAcrescimo = valorBase.add(acrescimoGols);

        if (this.idade > 30){
            BigDecimal desconto = valorComAcrescimo.multiply(new BigDecimal("0.25"));

            return valorComAcrescimo.subtract(desconto);
        }
        return valorComAcrescimo;
    }
}
