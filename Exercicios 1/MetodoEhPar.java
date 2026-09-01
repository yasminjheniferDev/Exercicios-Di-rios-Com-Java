import java.util.Scanner;

public class MetodoEhPar {
    public static boolean ehPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        boolean resultado = MetodoEhPar.ehPar(sc.nextInt());
        if (resultado) {
            System.out.print(" Esse número é par");
        } else {
            System.out.print("Esse número é impar");
        }
    }
}
