import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cod1 = teclado.nextInt();
        int nump1 = teclado.nextInt();
        double val1 = teclado.nextDouble();
        int cod2 = teclado.nextInt();
        int nump2 = teclado.nextInt();
        double val2 = teclado.nextDouble();
        double valtot = ((nump1 * val1) + (nump2 * val2));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valtot);


    }
}
