import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        double percentual = 0;
        int percentualint=0;
        if (sal <= 400) {
            percentual = 0.15;
            percentualint=15;

        } else if (sal <= 800) {
            percentual = 0.12;
           percentualint=12;


        } else if (sal <= 1200) {
            percentual = 0.10;
         percentualint=10;

        } else if (sal <= 2000) {
            percentual = 0.07;
         percentualint= 7;

        } else {
            percentual = 0.04;
            percentualint=4;
        }
        double reajuste = sal * percentual;
        double novosal = sal + reajuste;
        System.out.printf("Novo salario: %.2f%n", novosal);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%%n" ,percentualint );
    }
}
