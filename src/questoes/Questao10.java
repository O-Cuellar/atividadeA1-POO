package questoes;

import java.util.Scanner;

public class Questao10 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);

    public void Imposto(double salarioMinimo, int numDependentes, double salarioFuncionario, double impostoPrevio){
        double impostoBruto = 0;
        double slrTributado = 0;
        double txAdicional = 0;
        double impostoTotal = 0;

        if(salarioFuncionario >= salarioMinimo * 12){
            impostoBruto = salarioFuncionario * 0.2;
            txAdicional = impostoBruto * 0.04;
            slrTributado = salarioFuncionario - txAdicional;
            } else if (salarioFuncionario >= salarioMinimo * 5) {
                impostoBruto = salarioFuncionario * 0.08;
                txAdicional = impostoBruto * 0.04;
                slrTributado = salarioFuncionario - txAdicional;
                } else {
                    slrTributado = salarioFuncionario;
                }
        impostoTotal = impostoPrevio + impostoBruto + txAdicional;

        System.out.println("O valor do Salário com os descontos de imposto será: " + slrTributado + " e o valor dos impostos pagos é " + impostoTotal);
    }

    public void Executar(){
        System.out.println("\n----Calculo de imposto----");
        System.out.println("\nDigite o valor do sálario mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("\nDigite o número de dependentes: ");
        int numDependentes = scanner.nextInt();
        System.out.println("\nDigite o valor do salário do funcíonario: ");
        double salarioFuncionario = scanner.nextDouble();
        System.out.println("\nDigite a taxa de imposto já pega pelo funcionário: ");
        double impostoPrevio = scanner.nextDouble();
        Imposto(salarioMinimo, numDependentes, salarioFuncionario , impostoPrevio);
    }

}