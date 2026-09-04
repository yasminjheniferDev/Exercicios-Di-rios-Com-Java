
public class NParesFor {
    public static void main(String[] args) {


        // Laço imprimindo números entre 0 e 100 + incremento a cada 2 números. Números pares.
        for (int c = 0; c <= 100; c += 2) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println();

        // Laço imprimindo números entre 0 e 100 + condição se é par.
        for (int c = 0; c <= 100; c++) {
            if (c % 2 == 0) {
                System.out.println(c);

            }
        }
    }
}
