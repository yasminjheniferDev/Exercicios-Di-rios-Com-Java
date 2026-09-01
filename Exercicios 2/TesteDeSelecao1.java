import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.printf("Valores aceitos%n");
        } else {
            System.out.printf("Valores nao aceitos%n");
        }
    }
}

