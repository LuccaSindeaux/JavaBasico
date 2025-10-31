package veiculos;

import Militares.Militar;
import Militares.PodePilotarAviao;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Aviao extends Veiculo {
    public Aviao(PodePilotarAviao piloto, ArrayList<Militar> tripulacao, double kmPorLitro, BigDecimal precoPorLitro){
    super((Militar) piloto, tripulacao, kmPorLitro, precoPorLitro);
    }

    @Override
    public boolean tripulacaoValida(){
        PodePilotarAviao pilotoAviao = (PodePilotarAviao) this.piloto;
        if (!pilotoAviao.isLicencaAviaoValida()){
            return false;
        }

        return this.tripulacao.size()<=1; // true ou false -> retorna se a trip é maior que 1 (RN do avião)
    }
}
