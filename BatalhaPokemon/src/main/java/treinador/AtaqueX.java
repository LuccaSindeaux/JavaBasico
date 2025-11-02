package treinador;
import pokemon.Pokemon;

public class AtaqueX extends Item{
    private static final int AUMENTO_ATAQUE = 200;

    public AtaqueX(){
        super(1);
    }

    @Override
    public void usarItem(Pokemon pokemon){
        int ataqueAtual = pokemon.getAtaque();
        pokemon.setAtaque(ataqueAtual + AUMENTO_ATAQUE);

        System.out.println("O ataque de " + pokemon.getNome() + " aumentou drasticamente!");
    }
}
