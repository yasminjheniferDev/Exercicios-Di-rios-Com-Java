import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *=i;
    }
        System.out.println("o fatorial de " +num + " é " + fatorial);

    }
}
