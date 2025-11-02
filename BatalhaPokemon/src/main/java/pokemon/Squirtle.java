package pokemon;

public class Squirtle extends Pokemon{
    public Squirtle(){
        super(
                "Squirtle",
                TipoPokemon.AGUA,
                new Movimento("Bolhas", 75, TipoMovimento.ESPECIAL),
                44,
                48,
                65,
                50,
                64,
                43
        );
    }
}
