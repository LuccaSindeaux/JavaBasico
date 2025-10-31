package veiculos;

import Militares.Militar;
import Militares.PodePilotarCaminhao;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    public Caminhao(PodePilotarCaminhao piloto, ArrayList<Militar> tripulacao, double kmPorLitro, BigDecimal precoPorLitro){
        super((Militar) piloto, tripulacao, kmPorLitro, precoPorLitro);
    }

    @Override
    public boolean tripulacaoValida(){
        PodePilotarCaminhao pilotoCaminhao = (PodePilotarCaminhao) this.piloto;
        if (!pilotoCaminhao.isLicencaCaminhaoValida()){
            return false;
        }

        boolean minimo = this.tripulacao.size() >= 5;
        boolean maximo = this.tripulacao.size() <= 30;
        return minimo && maximo;
    }
}
