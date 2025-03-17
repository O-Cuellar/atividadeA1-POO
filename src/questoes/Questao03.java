package questoes;

import java.util.Scanner;

public class Questao03 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    
    public double Converte(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public void Executar(){
        System.out.println("\n--------CONVERSOR DE TEMPERATURA--------\n");
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = Converte(celsius);
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }   
}