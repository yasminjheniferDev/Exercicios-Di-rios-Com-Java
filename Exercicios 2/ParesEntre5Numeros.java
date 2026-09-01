import java.util.Scanner;

public class ParesEntre5Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            int val3 = sc.nextInt();
            int val4 = sc.nextInt();
            int val5 = sc.nextInt();
            int pares=0;
            if (val1 % 2 == 0) {
                pares++;
            }
            if (val2 % 2 == 0) {
                pares++;
            }
            if (val3 % 2 == 0) {
                pares++;
            }
            if (val4 % 2 == 0) {
                pares++;
            }
            if (val5 % 2 == 0) {
            pares++;
        }
            System.out.printf("%d valores pares%n",pares);
        }
    }
}
