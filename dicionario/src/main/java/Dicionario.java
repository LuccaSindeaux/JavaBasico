import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    private Map<String, String> inglesParaPortugues;
    private Map<String, String> portuguesParaIngles;

    public Dicionario(){
        this.inglesParaPortugues = new HashMap<>();
        this.portuguesParaIngles = new HashMap<>();
    }



    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario){
        String palavraChave = palavra.toLowerCase();

        if (dicionario == TipoDicionario.PORTUGUES){
            this.inglesParaPortugues.put(palavraChave, traducao);
        } else if (dicionario == TipoDicionario.INGLES){
            this.portuguesParaIngles.put(palavraChave, traducao);
        }
    }

    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca){
        String chaveBusca = palavra.toLowerCase();
        String traducao = null;

        if (dicionarioDeBusca == TipoDicionario.INGLES){
            traducao = this.portuguesParaIngles.get(chaveBusca);
        } else if (dicionarioDeBusca == TipoDicionario.PORTUGUES){
            traducao = this.inglesParaPortugues.get(chaveBusca);
        }

        if (traducao == null){
            throw new PalavraNaoEncontradaException("A palavra: " + palavra + " não foi encontrada no dicionárop " + dicionarioDeBusca + ".");
        }

        return traducao;
    }


}
