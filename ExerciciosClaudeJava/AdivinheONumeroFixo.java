import java.util.Scanner;


public class AdivinheONumeroFixo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o número ? adivinhe ");
        int resp = teclado.nextInt();
        int numsecreto = 1;
        while (resp != numsecreto) {
            if (resp > numsecreto) {
                System.out.println("Muito alto! Tente de novo.");
            } else {
                System.out.println("Muito baixo! Tente de novo.");
            }
            System.out.print("Tente adivinhar novamente: ");
            resp = teclado.nextInt();

        }

                System.out.println("Parabéns , você acertou!");


        }
    }


