package questoes;

import java.util.Scanner;

public class Questao08 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);

    public void FinalPrice(double valorFabrica){
        int opcao;
        double valorFinal = 0;

        do {
            System.out.println("Digite as opções desejadas na fabricação do veículo, após escolher as opções desejadas, digite 0 para o calculo final: \n");
            System.out.println("1 - Ar condicionado (R$ 1.750,00)");
            System.out.println("2 - Pintura metálica (R$ 800,00)");
            System.out.println("3 - Vidro Elétrico (R$ 1.200,00)");
            System.out.println("4 - Direção hidráulica (R$ 2.000,00)");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    valorFinal = valorFabrica + 1750.00;
                    break;
                case 2:
                    valorFinal = valorFabrica + 800.00;
                case 3:
                    valorFinal = valorFabrica + 1200.00;
                case 4:
                    valorFinal = valorFabrica + 2000.00;
            }

        } while (opcao != 0);

        System.out.println("O preço final do veículo com os itens adicionados é: R$ " + valorFinal);
    }

    public void Executar(){
        System.out.println("\n----Calculo do valor final de um veiculo-----\n");
        System.out.println("Digite o valor inicial de fábrica do veículo: \n");
        double valorFabrica = scanner.nextDouble();
        FinalPrice(valorFabrica);
    }
}