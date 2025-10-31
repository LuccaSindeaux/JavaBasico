package veiculos;

import Militares.Militar;
import Militares.PodePilotarHelicoptero;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Helicoptero extends Veiculo {
    public Helicoptero(PodePilotarHelicoptero piloto, ArrayList<Militar> tripulacao, double kmPorLitro, BigDecimal precoPorLitro){
        super((Militar) piloto, tripulacao, kmPorLitro, precoPorLitro);
    }

    @Override
    public boolean tripulacaoValida(){
        PodePilotarHelicoptero pilotoHelicoptero = (PodePilotarHelicoptero) this.piloto;
        if (!pilotoHelicoptero.isLicencaHelicopteroValida()){
            return false;
        }

        return this.tripulacao.size()<=10; // true ou false -> retorna se a trip é menor que 10 (RN do Helicoptero)
    }

}
