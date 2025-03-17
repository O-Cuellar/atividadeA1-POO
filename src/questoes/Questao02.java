package questoes;

import java.util.Scanner;

public class Questao02 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);
    //Calcula a área do retangulo e retorna o valor pra area1 e 2
    public int CalcularArea(int base, int altura){
        return base *altura;
    }

    public void Comparar(int area1, int area2){
        if (area1 == area2){
            System.out.println("As áreas dos dois retângulos são iguais.");
        } else if (area1 > area2){
            System.out.println("A área do primeiro retângulo é maior que a do segundo.");
            } else {
                System.out.println("A área do segundo retângulo é maior que a do primeiro.");
            }
    }

    public void Executar(){
        System.out.println("\n--------COMPARADOR DE ÁREAS DE RETÂNGULOS--------\n");
        System.out.println("Digite a base do primeiro retângulo: ");
        int base1 = scanner.nextInt();
        System.out.println("Digite a altura do primeiro retângulo: ");
        int altura1 = scanner.nextInt();
        System.out.println("Digite a base do segundo retângulo: ");
        int base2 = scanner.nextInt();
        System.out.println("Digite a altura do segundo retângulo: ");
        int altura2 = scanner.nextInt();
        int area1 = CalcularArea(base1, altura1);
        int area2 = CalcularArea(base2, altura2);
        Comparar(area1, area2);
    }
}