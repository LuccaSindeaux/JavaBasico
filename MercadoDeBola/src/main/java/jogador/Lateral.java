package jogador;

import apetite.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Lateral extends Jogador {
    private int cruzamentosCertos;

    public Lateral(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetite, BigDecimal preco, int cruzamentosCertos){
        super(nome, idade, clubeAtual, reputacaoHistorica, apetite, preco);

        this.cruzamentosCertos = cruzamentosCertos;
    }

    @Override
    public BigDecimal getValorCompra(){
        BigDecimal valorBase = super.getValorCompra();

        BigDecimal percentualAcrescimo = new BigDecimal("0.02").multiply(new BigDecimal(this.cruzamentosCertos));

        BigDecimal valorAcrescimo = valorBase.multiply(percentualAcrescimo);

        BigDecimal valorComAcrescimo = valorBase.add(valorAcrescimo);

        if (this.idade > 28){
            BigDecimal desconto = valorComAcrescimo.multiply(new BigDecimal("0.30"));

            return valorComAcrescimo.subtract(desconto);
        }

        return valorComAcrescimo;
    }
}
