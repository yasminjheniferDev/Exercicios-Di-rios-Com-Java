import java.time.Duration;
import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundostotal= teclado.nextInt();
        Duration duracao= Duration.ofSeconds(segundostotal);
        long horas= duracao.toHours();
        int minutos = duracao.toMinutesPart();
        int dias = duracao.toSecondsPart();

        System.out.printf("%d:%d:%d%n",horas,minutos,dias);
    }
}
