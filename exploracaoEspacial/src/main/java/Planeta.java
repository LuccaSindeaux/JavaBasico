import java.util.ArrayList;
import java.util.List;

public class Planeta {
    private final int posicao;
    private final List<Recurso> recursos;

    public Planeta(int posicao, List<Recurso> listaRecursos){
        this.posicao = posicao;
        this.recursos = new ArrayList<>(listaRecursos);
    }

    public int getPosicao(){
        return this.posicao;
    }

    public int getValorTotal(){
        int valorTotal = 0;

        for(Recurso rec : this.recursos){
            valorTotal += rec.getValor();
        }
        return valorTotal;
    }

    public int getValorPorPeso(){
        int valorPorPeso = 0;

        for (Recurso rec : this.recursos){
            if (rec.getPeso() != 0){
                valorPorPeso += rec.getValor() / rec.getPeso();
            }
        }
        return valorPorPeso;
    }

    public List<Recurso> getRecursos(){
        return new ArrayList<>(this.recursos);
    }
}
