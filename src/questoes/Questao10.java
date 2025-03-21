package questoes;

import java.util.Scanner;

public class Questao10 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);

    public double ImpostoBruto(double salarioMinimo, double salarioFuncionario){
        double impostoBruto = 0;
        double taxa = 0;
        double impostoLiquido = 0;
        if (salarioFuncionario >= salarioMinimo * 12){
            impostoBruto = 0.2;
            } else if (salarioFuncionario >= salarioMinimo * 5){
                impostoBruto = 0.08;
                } else {
                    impostoBruto = 0;
                }
        taxa = impostoBruto * 0.04;
        impostoLiquido = impostoBruto + taxa;
        return impostoLiquido;
    }

    public void Executar(){
        double impostoTotal = 0;
        
        System.out.println("Digite o valor do salário-mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        int numDependentes = scanner.nextInt();
        System.out.println("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();
        System.out.println("Digite o valor do imposto já pago pelo funcionario: \n ");
        double impostoAnterior = scanner.nextDouble();
        double impostoLiquido = ImpostoBruto(salarioMinimo,  salarioFuncionario);
        impostoTotal = impostoAnterior + impostoLiquido;
        System.out.println("A quantidade total de imposto descontada do sálario será: " + impostoTotal);
    }
}