import java.util.Scanner;

public class MaiorEntre10Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;


        //laço que vai pedir 10 números ao usuário + condição que vai verificar qual o maior número entre eles.

        for (int i = 0; i < 10; i++) {
            int c = sc.nextInt();
            if (c > maior) {
                maior = c;

            }
        }
        System.out.println("O maior número foi: " + maior + ".");
    }
}

