import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int tempogasto= teclado.nextInt();
        int velocidademedia= teclado.nextInt();
        double distancia= tempogasto * velocidademedia;
        double litrosnecessarios= distancia / 12;
        System.out.printf("%.3f\n", litrosnecessarios);
    }
}
