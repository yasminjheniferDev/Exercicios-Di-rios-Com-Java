public class NImparesFor {
        public static void main(String[] args) {


            // Laço imprimindo números entre 1 e 100 + incremento a cada 2 números. Números impares.
            for (int c = 1; c <= 100; c+=2) {
                System.out.println(c);
            }

            System.out.println();
            System.out.println();

            // Laço imprimindo números entre 1 e 100 + condição se é ímpar.
            for (int c = 1; c <= 100; c++) {
                if (c % 2 == 1) {
                    System.out.println(c);

                }
            }
        }
    }

