import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dd= sc.nextInt();
        if( dd == 61){
            System.out.println("Brasilia");
        } else if ( dd == 71){
            System.out.println("Salvador");
        } else if ( dd == 11){
            System.out.println("Sao Paulo");
        } else if ( dd == 21){
            System.out.println("Rio de Janeiro");
        } else if ( dd == 32){
            System.out.println("Juiz de Fora");
        } else if( dd == 19){
            System.out.println("Campinas");
        } else if ( dd == 27){
            System.out.println("Vitoria");
        } else if ( dd == 31){
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
