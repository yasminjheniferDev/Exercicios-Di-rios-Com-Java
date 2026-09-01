import java.util.Scanner;

public class FormulaDeBaskara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double delta = (B * B) - (4 * A * C);
        if (A == 0 || delta < 0) {
            System.out.printf("impossivel calcular%n");
        } else {
            double r1 = (-B + Math.sqrt(delta)) / (2 * A );
            double r2 = (-B - Math.sqrt(delta)) / (2 * A );

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n",r2);
        }
    }
}


