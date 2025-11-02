package treinador;
import pokemon.Pokemon;

public class Pocao extends Item{
    private static final int CURA =50;

    public Pocao(){
        super(2);
    }

    @Override
    public void usarItem(Pokemon pokemon){
        int vidaAtual = pokemon.getPontosDeSaude();
        int vidaMaxima = pokemon.getPontosDeSaudeIniciais();
        int vidaNova = Math.min(vidaAtual + CURA, vidaMaxima);

        pokemon.setPontosDeSaude(vidaNova);
        System.out.println(pokemon.getNome() + " foi curado em " + (vidaNova - vidaAtual) + "HP!");
    }
}
