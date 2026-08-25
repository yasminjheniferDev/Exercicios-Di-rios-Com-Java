import java.util.Scanner;

public class AreaDoCirculo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);

        double raio= teclado.nextDouble();

        double pi= 3.14159;

        double area= pi * Math.pow(raio,2);

        System.out.printf("A=%.4f%n" , area);

        System.out.println();
    }
}
