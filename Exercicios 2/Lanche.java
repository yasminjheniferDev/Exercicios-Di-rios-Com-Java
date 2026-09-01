import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coditem= sc.nextInt();
        int quantitem= sc.nextInt();

        double valor = switch (coditem) {
            case 1 -> 4.00;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            default -> 1.50;
        };
        double resultado = valor * quantitem;
        System.out.printf("Total: R$ %.2f%n",resultado);
        }
    }
