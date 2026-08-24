import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
         int idade = teclado.nextInt();
        if (idade>=18){
            System.out.println("Voce é maior de idade.");

        } else {
            System.out.println("Voce é menor de idade.");
        }

    }
}
