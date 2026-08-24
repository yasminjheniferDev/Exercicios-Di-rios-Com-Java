import java.util.Scanner;

public class MaiorEntre3Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1= teclado.nextInt();
        System.out.print("Digite um segundo número: ");
        int n2 = teclado.nextInt();
        System.out.print("Digite um terceiro número: ");
        int n3 = teclado.nextInt();
        if ( (n1 > n2) && ( n1 > n3 )){
            System.out.println("O maior número é: " + n1);
        } else if ( ( n1<n2) && ( n2 > n3)){
            System.out.println("O maior número é: " + n2);
        }else {
            System.out.println("O maior número é: " + n3);
        }

    }
}
