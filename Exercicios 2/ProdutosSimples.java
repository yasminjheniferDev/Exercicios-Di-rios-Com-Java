import java.util.Scanner;

public class ProdutosSimples {
    public static void Main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int PROD = valor1 * valor2;

        System.out.print("PROD = " + PROD + "\n");
    }
}
