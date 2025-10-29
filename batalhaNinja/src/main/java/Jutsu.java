public class Jutsu {
    private final String nomeJutsu;
    private final int consumoChakra;
    private final int dano;

    public Jutsu (String nomeJutsu, int consumoChakra, int dano) {
        this.nomeJutsu = nomeJutsu;
        if (consumoChakra > 5){
            this.consumoChakra = 5;
        } else{
            this.consumoChakra = consumoChakra;
        }
        if (dano > 10){
            this.dano = 10;
        } else{
            this.dano = dano;
        }
    }

    public String getNomeJutsu(){
        return this.nomeJutsu;
    }

    public int getConsumoChakra(){
        return this.consumoChakra;
    }

    public int getDano(){
        return this.dano;
    }
}
