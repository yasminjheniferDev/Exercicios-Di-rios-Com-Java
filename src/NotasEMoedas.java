import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorDigitado = teclado.nextDouble();

        // Converte para centavos (inteiro) para evitar erros de arredondamento
        int valor = (int) Math.round(valorDigitado * 100);

        int notas100 = valor / 10000;
        valor = valor % 10000;

        int notas50 = valor / 5000;
        valor = valor % 5000;

        int notas20 = valor / 2000;
        valor = valor % 2000;

        int notas10 = valor / 1000;
        valor = valor % 1000;

        int notas5 = valor / 500;
        valor = valor % 500;

        int notas2 = valor / 200;
        valor = valor % 200;

        int moedas1r = valor / 100;
        valor = valor % 100;

        int moedas50 = valor / 50;
        valor = valor % 50;

        int moedas25 = valor / 25;
        valor = valor % 25;

        int moedas10 = valor / 10;
        valor = valor % 10;

        int moedas5 = valor / 5;
        valor = valor % 5;

        int moedas1ce = valor; // o que sobrar já é o número de centavos de 1

        System.out.printf("NOTAS:%n");
        System.out.printf("%d nota(s) de 100.00%n", notas100);
        System.out.printf("%d nota(s) de 50.00%n", notas50);
        System.out.printf("%d nota(s) de 20.00%n", notas20);
        System.out.printf("%d nota(s) de 10.00%n", notas10);
        System.out.printf("%d nota(s) de 5.00%n", notas5);
        System.out.printf("%d nota(s) de 2.00%n", notas2);
        System.out.printf("MOEDAS:%n");
        System.out.printf("%d moeda(s) de 1.00%n", moedas1r);
        System.out.printf("%d moeda(s) de 0.50%n", moedas50);
        System.out.printf("%d moeda(s) de 0.25%n", moedas25);
        System.out.printf("%d moeda(s) de 0.10%n", moedas10);
        System.out.printf("%d moeda(s) de 0.05%n", moedas5);
        System.out.printf("%d moeda(s) de 0.01%n", moedas1ce);
    }
}