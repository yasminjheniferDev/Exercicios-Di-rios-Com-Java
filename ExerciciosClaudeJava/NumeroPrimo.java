import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO: ");
        int num = teclado.nextInt();
        boolean primo=true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
            if(primo){
                System.out.println("ESSE NÚMERO É PRIMO.");
            } else {
                System.out.println("ESSE NÚMERO NÃO É PRIMO.");
            }
        }
    }

