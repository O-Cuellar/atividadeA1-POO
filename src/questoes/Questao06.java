package questoes;

import java.util.Scanner;

public class Questao06 extends BaseQuestao{
    Scanner scanner = new Scanner(System.in);

    public void Duracao(int horaInicio, int minutoInicio, int horaFim, int minutoFim){
        int duracaoHoras = 0;
        int duracaoMinutos = 0;
        duracaoHoras = horaFim - horaInicio;
        duracaoMinutos = minutoFim - minutoInicio;
        
        if(duracaoMinutos < 0){
            duracaoHoras--;
            duracaoMinutos += 60;           
        } 
        
        if(horaFim < horaInicio){
            duracaoHoras += 24;
        }

        System.out.println("A duração do jogo foi de " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");
        
    }

    public void Executar(){
        System.out.println("\n-----Calcula a duração de um jogo-----");
        System.out.println("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();
        System.out.println("Digite os minutos de início do jogo: ");
        int minutoInicio = scanner.nextInt();
        System.out.println("Digite a hora de término do jogo: ");
        int horaFim = scanner.nextInt();
        System.out.println("Digite os minutos de término do jogo: ");
        int minutoFim = scanner.nextInt();
        Duracao(horaInicio, minutoInicio, horaFim, minutoFim);
    }
}