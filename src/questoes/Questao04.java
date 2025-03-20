package questoes;

import java.util.Scanner;

public class Questao04 extends BaseQuestao{
    Scanner in = new Scanner(System.in);

    public void Verifica(int alunos, int alunas){
        if(alunos == alunas){
            System.out.println("O número de alunos é igual ao número de alunas.");
        } else if(alunos > alunas){
            System.out.println("O número de alunos é maior que o número de alunas.");
        } else{
            System.out.println("O número de alunos é menor que o número de alunas.");
        }

    }

    public void Executar(){
        System.out.println("\n-----Verifica se o número de alunos é igual ao número de alunas-----");
        System.out.println("Digite o número de alunos: ");
        int alunos = in.nextInt();
        System.out.println("Digite o número de alunas: ");
        int alunas = in.nextInt();
        Verifica(alunos, alunas);
    }
}