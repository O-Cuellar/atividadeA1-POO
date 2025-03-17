package questoes;

import java.util.Scanner;

public class Questao01 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    
    public void Checar(int n1, int n2){
        if (n1 > n2) {
            System.out.println("O primeiro é maior");
        }
        else{
            System.out.println("O segundo é maior");
        }
    }

    public void Executar(){
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro: ");
        int n2 = scanner.nextInt();
        Checar(n1, n2);
    }

}