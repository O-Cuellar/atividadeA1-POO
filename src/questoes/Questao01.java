package questoes;

import java.util.Scanner;

public class Questao01 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    
    public void Checar(int n1, int n2){
        if (n1 == n2) {
            System.out.println("Os dois números são iguais" );
        } else if (n1> n2) {
            System.out.println(n1 +" é maior do que " + n2);
            } else {
                System.out.println(n2 +" é maior do que "+ n1);
                }
    }

    public void Executar(){
        System.out.println("--------COMPARADOR DE NÚMEROS--------\n");  
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro: ");
        int n2 = scanner.nextInt();
        Checar(n1, n2);
    }

}