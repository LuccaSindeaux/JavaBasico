public class Batalha {
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja){
        if (primeiroNinja.getNomeNinja().equals("Itachi")){
            return primeiroNinja;
        }
        if (segundoNinja.getNomeNinja().equals("Itachi")) {
            return segundoNinja;
        }

        Ninja ninjaVencedor;

        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);

        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);

        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);

        if (primeiroNinja.getReservaChakra() > segundoNinja.getReservaChakra()) {
            ninjaVencedor =  primeiroNinja;
        } else if (primeiroNinja.getReservaChakra() < segundoNinja.getReservaChakra()){
            ninjaVencedor = segundoNinja;
        } else {
            ninjaVencedor = primeiroNinja;
        }

        return ninjaVencedor;
    }
}
