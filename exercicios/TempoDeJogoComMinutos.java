package ExerciciosBeecroodJava;

import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaIni = sc.nextInt();
        int minutIni = sc.nextInt();
        int horaFim = sc.nextInt();
        int minutFim = sc.nextInt();

        int duracaoH = 0;
        int duracaoM = 0;

        if (minutFim >= minutIni) {
            duracaoM = minutFim - minutIni;
        } else {
            duracaoM = 60 - minutIni + minutFim;
            horaFim--;
        }

        if (horaFim >= horaIni) {
            duracaoH = horaFim - horaIni;
        } else {
            duracaoH = 24 - horaIni + horaFim;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoH, duracaoM);
    }
}