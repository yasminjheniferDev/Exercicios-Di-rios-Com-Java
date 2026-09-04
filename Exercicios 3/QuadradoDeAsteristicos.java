import java.util.Scanner;

public class QuadradoDeAsteristicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos lados tem o quadrado?");
        int l = entrada.nextInt();

        for (int linha = 0; linha < l; linha++) {
            for(int coluna = 0; coluna < l; coluna++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}