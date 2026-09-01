import java.util.Scanner;

public class SomaDeImparesConsecutivos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(SomaImpares(X,Y));

            sc.close();
        }

    }

    public static int SomaImpares(int X, int Y) {
        int soma=0;
        int inicio = Math.min(X,Y);
        int fim = Math.max(X,Y);
        for (int n = inicio + 1; n < fim; n++) {
            if (n % 2 != 0) {
                soma+= n;
            }

        }

       return soma;
    }
}

