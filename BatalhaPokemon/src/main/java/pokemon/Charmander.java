package pokemon;

public class Charmander extends Pokemon{
    public Charmander(){
        super("Charmander",
                TipoPokemon.FOGO,
                new Movimento("Brasas", 70, TipoMovimento.ESPECIAL),
                39,
                52,
                43,
                60,
                50,
                65
        );
    }
}
