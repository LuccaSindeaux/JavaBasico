import java.util.ArrayList;
import java.util.List;

public class Nave {
    private static final int CUSTO_POR_POSICAO = 3;
    private int quantidadeDeCombustivel;
    private int posicao;

    public Nave(int combustivelInicial){
        this.quantidadeDeCombustivel = combustivelInicial;
        this.posicao = 0;
    }

    public int getQuantidadeDeCombustivel() {
        return this.quantidadeDeCombustivel;
    }

    public int getPosicao(){
        return this.posicao;
    }

    public List<Recurso> explorar(Planeta planeta){
        List <Recurso> recursosColetados = new ArrayList<>();
        int posicaoInicial = 0;

        boolean chegou = viajar(planeta.getPosicao());

        if (chegou){
            recursosColetados.addAll(planeta.getRecursos());
        }

        viajar(posicaoInicial);

        return recursosColetados;
    }

    public List<Recurso> explorar(List<Planeta> planetas){
        List<Recurso> recursosColetados = new ArrayList<>();
        int posicaoInicial = 0;

        for (Planeta planetaAtual :planetas){
            boolean chegou = viajar(planetaAtual.getPosicao());

            if (chegou){
                recursosColetados.addAll(planetaAtual.getRecursos());
            } else{
                break;
            }
        }

        viajar(posicaoInicial);

        return recursosColetados;
    }

    private boolean viajar(int destino){
        int distancia = Math.abs(destino - this.posicao);
        int combustivelNecessario = distancia * CUSTO_POR_POSICAO;

        if (this.quantidadeDeCombustivel >= combustivelNecessario){
            this.quantidadeDeCombustivel -= combustivelNecessario;
            this.posicao = destino;
            return true;
        } else{
            int posicaoPossivel = this.quantidadeDeCombustivel / CUSTO_POR_POSICAO;
            int combustivelGasto = posicaoPossivel * CUSTO_POR_POSICAO;
            int direcao;

            if (destino > this.posicao){
                direcao = 1;
            } else{
                direcao = -1;
            }

            this.posicao = this.posicao + (posicaoPossivel * direcao);
            this.quantidadeDeCombustivel -= combustivelGasto;
            return false;
        }
    }
}
