package treinador;
import pokemon.Pokemon;

public class AtaqueEspecialX extends Item{
    private static final int AUMENTO_ATAQUE_ESPECIAL = 200;
    public AtaqueEspecialX(){
        super(1);
    }
    @Override
    public void usarItem(Pokemon pokemon){
        int ataqueEspecialAtual = pokemon.getAtaqueEspecial();
        pokemon.setAtaqueEspecial(ataqueEspecialAtual + AUMENTO_ATAQUE_ESPECIAL);

        System.out.println("O ataque especial de " + pokemon.getNome() + " aumentou drasticamente!");
    }
}
