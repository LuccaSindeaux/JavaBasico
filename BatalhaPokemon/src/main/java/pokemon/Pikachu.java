package pokemon;

public class Pikachu extends Pokemon{
    public Pikachu(){
        super(
                "Pikachu",
                TipoPokemon.ELETRICO,
                new Movimento("AtaqueRapido", 60, TipoMovimento.FISICO),
                 35,
                55,
                40,
                50,
                50,
                90
        );
    }
}
