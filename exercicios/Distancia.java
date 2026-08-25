import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int km= teclado.nextInt();
        int tempogasto= km * 2;
        System.out.printf("%d minutos \n",tempogasto);
    }
}
