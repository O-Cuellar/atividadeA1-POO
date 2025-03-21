package questoes;

import java.util.Scanner;

public class Questao09 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    
    public void Calcula(double valorInicial, double consumo, int consumidor){
        double residencial = 5;
        double comercial = 500;
        double industrial = 800;
        double custo = 0;
        double valorTotal = 0;

        switch (consumidor) {
            case 1:
                custo = residencial + (consumo * 0.05);
                break;
            case 2:
                if (consumo <= 80 && consumo > 0) {
                    custo = comercial;
                    } else {
                        custo = comercial + (consumo * 0.25);
                    }
                break;
            case 3:
                if (consumo <= 100 && consumo > 0) {
                    custo = industrial;
                    } else {
                        custo = industrial + (consumo * 0.04);
                    }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        valorTotal = valorInicial + custo;
        System.out.println("O valor total a ser pago será: " + valorTotal);
    }

    public void Executar(){
        System.out.println("\n----Calculo da conta de água----");
        System.out.println("\nDigite o valor inicial da conta: ");
        double valorInicial = scanner.nextDouble();
        System.out.println("\nDigite o consumo de água por m³: ");
        double consumo = scanner.nextDouble();
        System.out.println("\nDigite a opção equivalente ao tipo de consumidor:\n1-RESIDENCIAL\n2-COMERCIAL\n3-INDUSTRIAL");
        int consumidor = scanner.nextInt();
        Calcula(valorInicial, consumo, consumidor);
    }
}