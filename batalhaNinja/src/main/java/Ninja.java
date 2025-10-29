public class Ninja {
    private final String nomeNinja;
    private final Jutsu jutsuPrincipal;
    private int reservaChakra = 100;

    public Ninja(String nomeNinja, Jutsu jutsuPrincipal){
        this.nomeNinja = nomeNinja;

        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void receberGolpe(int danoRecebido){
        this.reservaChakra -= danoRecebido;
        System.out.println(this.nomeNinja + " recebeu " + danoRecebido + " de dano! Chakra restante de " +this.nomeNinja + " é " + this.reservaChakra);
    }

    public void atacar(Ninja ninjaOponente){
        int consumoChakra = this.jutsuPrincipal.getConsumoChakra();
        this.reservaChakra -= consumoChakra;
        System.out.println(this.nomeNinja + " usou " + this.jutsuPrincipal.getNomeJutsu());

        int dano = this.jutsuPrincipal.getDano();
        ninjaOponente.receberGolpe(dano);
    }

    public String getNomeNinja(){
        return this.nomeNinja;
    }

    public int getReservaChakra() {
        return this.reservaChakra;
    }
}
