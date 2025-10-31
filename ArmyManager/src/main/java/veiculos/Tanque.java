package veiculos;

import Militares.Militar;
import Militares.PodePilotarTanque;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Tanque extends Veiculo {

    public Tanque(PodePilotarTanque piloto, ArrayList<Militar> tripulacao, double kmPorLitro, BigDecimal precoPorLitro){
        super((Militar) piloto, tripulacao, kmPorLitro, precoPorLitro);
    }

    @Override
    public boolean tripulacaoValida(){
        PodePilotarTanque pilotoTanque = (PodePilotarTanque) this.piloto;
        if (!pilotoTanque.isLicencaTanqueValida()){
            return false;
        }

        return this.tripulacao.size()==3; // true ou false -> retorna se a trip é 3(RN do tanque)
    }
}
