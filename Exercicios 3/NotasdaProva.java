import java.util.Scanner;

public class NotasdaProva {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota= sc.nextDouble();

        if(nota >=7 ){
            System.out.println("Passou direto!Parabéns!");
        } else if( nota >= 5 ){
            System.out.println("Eita!Você não passou. Mas Você tem direito de fazer uma prova de recuperação.");

        } else {
            System.out.println("Você está reprovado.");
        }
       
    }

}
