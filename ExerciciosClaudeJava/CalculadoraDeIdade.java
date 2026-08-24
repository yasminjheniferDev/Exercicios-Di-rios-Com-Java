import java.util.Scanner;

public class CalculadoraDeIdade {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o seu ano de nascimento? ");
        int anonasc = teclado.nextInt();
        System.out.print( "Qual o seu ano atual? ");
        int anoatual= teclado.nextInt();
         int idade = (anoatual - anonasc );
        System.out.println("A sua idade atual é " + idade + ".");




    }
}
