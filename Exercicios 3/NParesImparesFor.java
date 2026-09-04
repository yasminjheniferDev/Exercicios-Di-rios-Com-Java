import java.util.Scanner;

public class NParesImparesFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);{
            int n = entrada.nextInt();
            int pares=0;
            int impares=0;

            // Laço imprimindo números de 0 até n(número que o usuário digitou) + condição para descobrir a quantidade de pares e ímpares, e quais são eles.

            for(int i = 0; i <= n ; i++){
                if(i % 2 == 0){
                    pares++;
                    System.out.println(i + " é par.");
                } else{
                    impares++;
                    System.out.println(i + " é impar.");
                }
            }
            System.out.println("Pares=" + pares + "." );
            System.out.println("Impares=" + impares + ".");
        }
    }
}
