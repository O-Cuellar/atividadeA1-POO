package questoes;

import java.util.Scanner;

public class Questao05 extends BaseQuestao{
    Scanner in = new Scanner(System.in);
    
    public double Calcular(double morangos, double macas){
        double vlrmorangos = 0;
        double vlrmacas = 0;

        if(morangos <= 5){
            vlrmorangos = morangos * 7.50;
            } else{
                vlrmorangos = morangos * 5.30;
            }

        if (macas <= 5){
            vlrmacas = macas * 3.50;
            } else{
                vlrmacas = macas * 2.80;
            }
        return vlrmorangos + vlrmacas;
    }

    public void Executar(){
        System.out.println("\n-----Calcula o valor a ser pago pelo cliente-----");
        System.out.println("Digite a quantidade de morangos em kg: ");
        double morangos = in.nextDouble();
        System.out.println("Digite a quantidade de maçãs em kg: ");
        double macas = in.nextDouble();
        double valor = Calcular(morangos, macas);
        double qtd = morangos + macas;
        if (qtd > 5 && valor >19){
            valor = valor - (valor * 0.8);
        }
        System.out.println("O valor a ser pago pelo cliente é: R$ " + valor);
    }
}