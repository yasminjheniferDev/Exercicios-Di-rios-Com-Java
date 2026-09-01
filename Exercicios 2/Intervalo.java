import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        if (v >= 0 && v <= 25) {
            System.out.printf("Intervalo [0,25]%n");
        } else if (v > 25 && v <= 50) {
            System.out.printf("Intervalo (25,50]%n");
        } else if (v > 50 && v <= 75) {
            System.out.printf("Intervalo (50,75]%n");

        } else if (v > 75 && v <= 100) {
            System.out.printf("Intervalo (75,100]%n");
        } else {
            System.out.printf("Fora de intervalo%n");

        }
    }
}
