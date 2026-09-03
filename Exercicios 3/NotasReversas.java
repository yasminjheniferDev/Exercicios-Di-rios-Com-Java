import java.util.Scanner;

public class NotasReversas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota da prova:");
        double nota= sc.nextDouble();

        if(nota >=0.0 && nota <=10.0){
            if(nota <5.0){
                System.out.println("Você foi reprovado.");
            } else if( nota < 7.0){
                System.out.println("Você está de recuperação.");

            } else {
                System.out.println("Parabéns! Você passou direto.");
            }

        } else{
            System.out.println("Nota inválida!");
        }

    }
}
