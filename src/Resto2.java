import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int N = sc.nextInt();

            Resto2f(N);

            sc.close();
        }
    }


    public static void Resto2f(int N) {
        for (int i = 1; i <= 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }
    }
}

