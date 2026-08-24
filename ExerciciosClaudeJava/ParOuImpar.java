import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Esse número é par.");
        } else {
            System.out.println("Esse número é ímpar.");

        }

    }
}