package negociacao;

import clube.Clube;
import jogador.Jogador;

import java.math.BigDecimal;

public class Negociacao {

    public boolean negociar(Clube clubeInteressado, Jogador jogadorDeInteresse){
        boolean temInteresse = jogadorDeInteresse.temInteresse(clubeInteressado);

        if (!temInteresse){
            return false;
        } // end if
        BigDecimal valorCompra = jogadorDeInteresse.getValorCompra();

        BigDecimal saldoClube = clubeInteressado.getSaldoEmCaixa();

        if (saldoClube.compareTo(valorCompra) < 0){
            return false;
        }

        clubeInteressado.debitar(valorCompra);

        jogadorDeInteresse.transferir(clubeInteressado);

        return true;
    }
}
