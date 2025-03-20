package questoes;

import java.util.Scanner;

public class Questao09 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    
    public void Executar(){
        System.out.println("Digite o valor inicial da conta de água: ");
        double valorInicial = scanner.nextInt();
        
    }
}