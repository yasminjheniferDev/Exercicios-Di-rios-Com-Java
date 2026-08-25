import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X = teclado.nextInt();
        double Y= teclado.nextDouble();
        double consumomedio= X / Y;
        System.out.printf("%.3f km/l\n", consumomedio);

    }
}
