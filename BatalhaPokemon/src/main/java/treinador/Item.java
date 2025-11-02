package treinador;
import pokemon.Pokemon;

public abstract class Item {
    protected int turnoAcionamento;

    public Item(int turnoAciomamento){
        this.turnoAcionamento = turnoAciomamento;
    }

    public abstract void usarItem(Pokemon pokemon);

    public int getTurnoAcionamento(){
        return this.turnoAcionamento;
    }
}
