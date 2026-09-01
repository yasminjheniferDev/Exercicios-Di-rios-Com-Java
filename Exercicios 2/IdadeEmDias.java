
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadedias= teclado.nextInt();


        int anos = idadedias / 365;
        idadedias = idadedias % 365;

        int meses= idadedias / 30;


        int d= idadedias % 30;


        System.out.printf("%d ano(s)%n",anos);
        System.out.printf("%d mes(es)%n",meses);
        System.out.printf("%d dia(s)%n",d);
    }
}
