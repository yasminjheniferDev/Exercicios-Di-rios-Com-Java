import java.util.Scanner;

public class TabuadaNDesconhecido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();

        //Laço imprimindo a tabuada de + do número que o usuário digitou.

        System.out.println("Tabuada de Adição de: " + n);

        for (int r = 0; r <= 10; r++) {
            System.out.println(n + " + " + r + " = " + (r + n));
        }

        //Laço imprimindo a tabuada de - do número que o usuário digitou.

        System.out.println("Tabuada de Subtração de: " + n);

        for (int r = 0; r <= 10; r++) {
            System.out.println((n + " - " + r + " = ") + (n - r));
        }

        //Laço imprimindo a tabuada de x do número que o usuário digitou.

        System.out.println("Tabuada de Multiplicação de: " + n);

        for (int r = 0; r <= 10; r++) {
            System.out.println(n + " x " + r + " = " + (r * n));
        }

        //Laço imprimindo a tabuada de % do número que o usuário digitou.

        System.out.println("Tabuada de Divisão de: " + n);

        for (int r = 1; r <= 10; r++) {
            System.out.println(n + " % " + r + " = " + (n / r));
        }
    }
}
