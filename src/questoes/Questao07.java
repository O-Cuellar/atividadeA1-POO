package questoes;

import java.util.Scanner;

public class Questao07 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    
    public void Pagamento(double totalGasto){
        double totalPago;
        
        System.out.println("Digite a opção de pagamento:\n");
        System.out.println("1 - A vista com 10% de desconto\n");
        System.out.println("2 - Em duas vezes (preço da etiqueta)\n");
        System.out.println("3 - de três até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00\n");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                totalPago = totalGasto - (totalGasto * 0.1);
                System.out.println("Opção de pagamento número 1 escolhida, a vista com 10% de desconto, valor a ser pago: " + totalPago);
                break;
            case 2:
                totalPago = totalGasto/2;
                System.out.println("Opção de pagamento número 2 escolhida, em duas vezes (preço de etiqueta), valor a ser pago em cada parcela: " + totalPago);
                break;
            case 3:
                if(totalGasto > 100){
                    System.out.println("Digite o número de parcelas: ");
                    int parcelas = scanner.nextInt();
                    totalPago = totalGasto * Math.pow(1+ 0.3, parcelas);
                    break;
                }
        }
    }

    public void Executar(){
        System.out.println("\n----Calculo de pagamento em compras da loja de roupas----");
        System.out.println("\nDigite o total gasto: ");
        double totalGasto = scanner.nextDouble();
        Pagamento(totalGasto);
    }
}