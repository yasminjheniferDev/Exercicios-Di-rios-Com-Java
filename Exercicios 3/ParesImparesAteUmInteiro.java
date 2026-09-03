import java.util.Scanner;

public class ParesImparesAteUmInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int N = sc.nextInt();
        int par = 0;
        int impar = 0;
        int c = 0;

        while (c <= N) {
            if (c % 2 == 0) {
                par++;
                System.out.println(c + " é par.");
            }
            if(c % 2 != 0){
                impar++;
                System.out.println(c + " é impar.");

            }
            c++;
        }
    }
}
