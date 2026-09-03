import java.util.Scanner;

public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int val1=sc.nextInt();
        System.out.println("Digite o segundo número:");
        int val2= sc.nextInt();
        System.out.println("Digite o terceiro número:");
        int val3=sc.nextInt();

        //Condição para encontrar o maior número.

        if(val1 > val2 && val1 > val3){
            System.out.println("O maior número é: " + val1 + ".");
        } else if ( val2 > val1 && val2 > val3){
            System.out.println("O maior número é: " + val2 + ".");
        } else{
            System.out.println("O maior número é: " + val3 + ".");
        }

        //Condição para encontrar o menor número.

        if(val1 < val2 && val1 < val3){
            System.out.println("O menor número é: " + val1 + ".");
        } else if(val2 < val1 && val2 < val3){
            System.out.println("O menor número é: " + val2 + ".");
        }else{
            System.out.println("O menor número é: " + val3 + ".");
        }

    }
}
