package pokemon;

public class Bulbasaur extends Pokemon{
    public Bulbasaur(){
        super(
                "Bulbasaur",
                TipoPokemon.GRAMA,
                new Movimento("FolhaNavalha", 60, TipoMovimento.FISICO),
                45,
                 49,
                49,
                 65,
                 65,
                 45
        );
    }
}
