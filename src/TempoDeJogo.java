import java.time.Duration;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int horaini= sc.nextInt();
        int horafi= sc.nextInt();
        int duracao ;
        if (horafi > horaini) {
            duracao = horafi - horaini;
        } else if (horafi< horaini) {
            duracao = 24 - horaini + horafi;
        } else {
            duracao = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
    }
}

