import java.util.Scanner;

public class NPatinhosDaXuxa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o números de patinhos que foram passear com a Xuxa:");
        int N = sc.nextInt();
        int cont=1;

        while ( cont<=N){
            System.out.printf(" %d patinho(s) foram passear %n", cont);
            System.out.println(" Além das montanhas ");
            System.out.println(" Para brincar ");
            System.out.printf(" A mamãe gritou: Quá, quá, quá, quáMas só %d patinhos voltaram de lá. %n",cont);
            System.out.println(" A mamãe patinha foi procurar ");
            System.out.println(" Além das montanhas ");
            System.out.println(" Na beira do mar ");
            System.out.println(" A mamãe gritou: Quá, quá, quá, quá ");
            System.out.printf(" E os %d patinho(s) voltaram de lá. %n",cont);
            System.out.println();
            System.out.println();
            cont++;

        }
    }
}
