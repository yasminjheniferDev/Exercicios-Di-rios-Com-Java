import java.util.Scanner;

public class SomaDe1AteN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        int cc=0;
        for (int i = 1; i <= numero; i++){
            if (i % 2 ==0){
                cc++;

            }
        }

        System.out.println( "Quantidade de números pares: " + cc);
    }


}

