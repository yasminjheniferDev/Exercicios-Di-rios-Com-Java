import java.util.Scanner;

public class OlaMundoPersonalizado {


    public static void main(String[] args) {


        Scanner teclado = new Scanner (System.in);
         System.out.print("Qual o seu nome ? ");
          String nome = teclado.nextLine();

        System.out.println(" Olá " + nome + " ! Seja bem-vindo(a). ");
    }



    }
