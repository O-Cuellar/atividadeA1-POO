package questoes;

import java.util.Scanner;

public class Questao07 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    
    public void Pagamento(float totalGasto){
        System.out.println("Digite a opção de pagamento:\n");
        System.out.println("1 - A vista com 10% de desconto\n");
        System.out.println("2 - Em duas vezes (preço da etiqueta)\n");
        System.out.println("3 - de três até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00\n");
        int option = scanner.nextInt();
    }

    public void Executar(){
        System.out.println("Digite o total gasto: ");
        float totalGasto = scanner.nextFloat();
        Pagamento(totalGasto);
    }
}