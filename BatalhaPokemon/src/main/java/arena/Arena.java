package arena;

import pokemon.Pokemon;
import treinador.Treinador;
import treinador.Item;

public class Arena {
    private Treinador treinadorA;
    private Treinador treinadorB;

    private int indicePokemonAtualA;
    private int indicePokemonAtualB;
    private int turnoAtual;

    public Arena(Treinador treinadorA, Treinador treinadorB){
        this.treinadorA = treinadorA;
        this.treinadorB = treinadorB;
    }

    public Treinador batalhar(){
        this.indicePokemonAtualA = 0;
        this.indicePokemonAtualB = 0;
        this.turnoAtual = 0;

        Pokemon pokemonA = this.treinadorA.getPokemons().get(this.indicePokemonAtualA);
        Pokemon pokemonB = this.treinadorB.getPokemons().get(this.indicePokemonAtualB);


        System.out.println("--- A BATALHA COMEÇA ---");
        System.out.println(treinadorA.getNome() + " lança " + pokemonA.getNome() + " para a batalha!");
        System.out.println(treinadorB.getNome() + " lança " + pokemonB.getNome() + " para a batalha!");
        System.out.println("-------------------------");

        while (true){
            this.turnoAtual++;
            System.out.println("---TURNO " + this.turnoAtual + "---");

            aplicarEfeitosItens(pokemonA, pokemonB);

            Pokemon primeiroAtacante;
            Pokemon segundoAtacante;
            Treinador treinadorPrimeiro;
            Treinador treinadorSegundo;

            if (pokemonA.getVelocidade() >= pokemonB.getVelocidade()){
                primeiroAtacante = pokemonA;
                treinadorPrimeiro = treinadorA;
                segundoAtacante = pokemonB;
                treinadorSegundo = treinadorB;
            } else{
                primeiroAtacante = pokemonB;
                treinadorPrimeiro = treinadorB;
                segundoAtacante = pokemonA;
                treinadorSegundo = treinadorA;
            }

            System.out.println(primeiroAtacante.getNome() + " ataca primeiro!");

            executarAtaque(primeiroAtacante, segundoAtacante);

            if (segundoAtacante.estaDerrotado()){
                System.out.println(segundoAtacante.getNome() + " foi derrotado!");

                Pokemon proximoPokemon = proximoPokemon(treinadorSegundo);
                if (proximoPokemon == null){
                    System.out.println(treinadorSegundo.getNome() + " não tem mais Pokemons!");
                    System.out.println("O vencedor é " + treinadorPrimeiro.getNome() + "!");
                    return treinadorPrimeiro;
                }

                if (treinadorSegundo == treinadorA){
                    pokemonA = proximoPokemon;
                } else{
                    pokemonB = proximoPokemon;
                }
            } else {
                executarAtaque(segundoAtacante, primeiroAtacante);

                if (primeiroAtacante.estaDerrotado()){
                    System.out.println(primeiroAtacante.getNome() + " foi derrotado!");

                    Pokemon proximoPokemon = proximoPokemon(treinadorPrimeiro);
                    if (proximoPokemon == null){
                        System.out.println(treinadorPrimeiro.getNome() + " não tem mais Pokemons!");
                        System.out.println("O vencedor é " + treinadorSegundo.getNome() + "!");
                        return treinadorSegundo;
                    }

                    if (treinadorPrimeiro == treinadorA){
                        pokemonA = proximoPokemon;
                    } else{
                        pokemonB = proximoPokemon;
                    }
                }
            }
            System.out.println("------------------------");
        } // fim do while
    } // end batalhar

    private void aplicarEfeitosItens(Pokemon pokemonA, Pokemon pokemonB){
        Item itemA = this.treinadorA.getItem();
        if (itemA != null && itemA.getTurnoAcionamento() == this.turnoAtual){
            System.out.println(this.treinadorA.getNome() + " usa " + itemA.getClass().getSimpleName() + "!");
            itemA.usarItem(pokemonA);
        }

        Item itemB = this.treinadorB.getItem();
        if (itemB != null && itemB.getTurnoAcionamento() == this.turnoAtual){
            System.out.println(this.treinadorB.getNome() + " usa " + itemB.getClass().getSimpleName() + "!");
            itemB.usarItem(pokemonB);
        }
    }

    public void executarAtaque(Pokemon atacante, Pokemon defensor){
        int dano = atacante.calulcarDano(defensor);

        defensor.setPontosDeSaude(defensor.getPontosDeSaude() - dano);
        System.out.println("> " + atacante.getNome() + " usa " + atacante.getMovimento().getNome() + " em " + defensor.getNome() + " causando " + dano + " de dano!");

        if (defensor.getPontosDeSaude() > 0){
            System.out.println("> " + defensor.getNome() + " fica com " + defensor.getPontosDeSaude() + " de HP.");
        }
    }

    private Pokemon proximoPokemon(Treinador treinador){
        int indiceAtual;
        if (treinador == treinadorA){
            this.indicePokemonAtualA++;
            indiceAtual = this.indicePokemonAtualA;
        } else {
            this.indicePokemonAtualB++;
            indiceAtual = this.indicePokemonAtualB;
        }

        if (indiceAtual < treinador.getPokemons().size()){
            Pokemon proximo = treinador.getPokemons().get(indiceAtual);
            System.out.println(treinador.getNome() + " envia " + proximo.getNome() + "!");
            return proximo;
        } else{
            return null;
        }
    }

}
