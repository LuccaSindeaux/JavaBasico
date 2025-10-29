package jogador;

import apetite.ApetiteFinanceiro;
import clube.Clube;
import java.math.BigDecimal;
// nome, idade, clube atual, reputacao historica, apetite financeiro, preco

public class Jogador {
    protected String nome;
    protected int idade;
    protected Clube clubeAtual;
    protected int reputacaoHistorica;
    protected ApetiteFinanceiro apetite;
    protected BigDecimal preco;

    protected Jogador(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetite, BigDecimal preco){
        this.nome = nome;
        this.idade = idade;
        this.clubeAtual = clubeAtual;
        this.reputacaoHistorica = reputacaoHistorica;
        this.apetite = apetite;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getReputacaoHistorica(){
        return this.reputacaoHistorica;
    }

    public String getClubeAtual(){
        if (this.clubeAtual == null){
            return "Sem Clube";
        }
        return this.clubeAtual.getNome();
    }

    public boolean temInteresse(Clube clubeInteressado){
        return clubeInteressado.getReputacaoHistorica() >= 1;
    }

    public BigDecimal getValorCompra(){
        return this.apetite.calcularPrecoComApetite(this.preco);
    }

    public void transferir(Clube novoClube){
        this.clubeAtual = novoClube;
    }

}
