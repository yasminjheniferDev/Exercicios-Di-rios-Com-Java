import java.util.Scanner;

public class MediaNotasAlunosIndeterminados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Quantos alunos tem na sua turma?");
            int N = sc.nextInt();
            int C = 0;
            double nota=0;
            int soma =0;

            while (C < N) {
                System.out.println("Qual a nota do aluno " + (C + 1));
                nota = sc.nextDouble();
                soma+=nota;
                C++;
            }
            double media = (double)soma / N;
            System.out.println("A média dos alunos é = " + media);
        }

    }
}
