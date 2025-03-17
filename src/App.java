import java.util.ArrayList;

import questoes.BaseQuestao;

public class App {
    public static void main(String[] args) throws Exception {
        //ArrayList que armazena a colecao de questoes
        ArrayList<BaseQuestao> questoes = new ArrayList<>();
        questoes.add(new questoes.Questao01());
        questoes.add(new questoes.Questao02());
        questoes.add(new questoes.Questao03());
        questoes.add(new questoes.Questao04());
        questoes.add(new questoes.Questao05());
        questoes.add(new questoes.Questao06());
        questoes.add(new questoes.Questao07());
        questoes.add(new questoes.Questao08());
        questoes.add(new questoes.Questao09());
        questoes.add(new questoes.Questao10());

        //ForEach que executa as questoes uma por uma, para cada questao em questoes -> executar
        for(BaseQuestao questao : questoes){
            questao.Executar();
        }
    }

}