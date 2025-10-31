package veiculos;


import Militares.Militar;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public abstract class Veiculo {
    protected Militar piloto;
    protected ArrayList<Militar> tripulacao;
    protected double quilometragemPorLitro;
    protected BigDecimal precoPorLitro;

    public Veiculo(Militar piloto, ArrayList<Militar> tripulacao, double kmPorLitro, BigDecimal precoPorLitro){
        this.piloto = piloto;
        this.tripulacao = tripulacao;
        this.quilometragemPorLitro = kmPorLitro;
        this.precoPorLitro = precoPorLitro;
    }

    public abstract boolean tripulacaoValida();

    public BigDecimal getCustoCombustivel(int distancia){
        BigDecimal distanciaPercorrida = BigDecimal.valueOf(distancia);
        BigDecimal kmPorLitro = BigDecimal.valueOf(this.quilometragemPorLitro);

        BigDecimal litros = distanciaPercorrida.divide(kmPorLitro, 2, RoundingMode.HALF_UP);

        return litros.multiply(this.precoPorLitro);
    }

    public BigDecimal getCustoTotalSalarios(){
        BigDecimal total = this.piloto.getSalario();

        // foe each
        for (Militar tripulante : this.tripulacao){
            total = total.add(tripulante.getSalario());
        }
        return total;
    }

    public Militar getPiloto(){
        return piloto;
    }

    public ArrayList<Militar> getTripulacao(){
        return tripulacao;
    }
}
