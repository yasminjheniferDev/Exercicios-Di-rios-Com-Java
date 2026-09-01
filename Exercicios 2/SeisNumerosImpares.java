import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int x = sc.nextInt();
            int contador = 0;
            int n = x;
            while (contador < 6) {
                if (n % 2 == 1) {
                    System.out.println(n);
                    contador++;
                }
                n++;
            }
        }
       sc.close();
    }
}

