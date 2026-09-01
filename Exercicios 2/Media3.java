import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

        System.out.printf("Media: %.1f%n", arredonda (media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", arredonda (notaExame));

            double mediaFinal = (media + notaExame) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", arredonda (mediaFinal));
        }
    }static double arredonda(double valor) {
        return new BigDecimal(valor).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
