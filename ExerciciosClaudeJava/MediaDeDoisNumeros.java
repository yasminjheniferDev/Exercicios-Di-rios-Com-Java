import java.util.Scanner;

public class MediaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a sua primeira nota: ");
        double n1= teclado.nextDouble();
        System.out.print("Qual a sua segunda nota: ");
        double n2 = teclado.nextDouble();
        double media = (n1 + n2 ) / 2 ;
        System.out.println(" A sua  média é igual a " + media);



    }
}

























