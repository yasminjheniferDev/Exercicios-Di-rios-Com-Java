import java.util.Scanner;

public class ClassificacaoDeNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua nota: ");
        double nota= teclado.nextDouble();
        if (nota >=7  ) {
            System.out.println("APROVADO.");
        } else if (( nota >=5 && nota <=6.9)) {
            System.out.println("RECUPERAÇÃO.");
        } else {
            System.out.println("REPROVADO");
        }
    }
}

