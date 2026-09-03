import java.util.Scanner;

public class Etiqueta {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nome = sc.nextLine();

        System.out.println("Digite seu endereço:");
        String endereco= sc.nextLine();

        System.out.println("Digite o seu cep:");
        String cep= sc.nextLine();

        System.out.println("Digite seu telefone:");
        String telefone= sc.nextLine();


        System.out.println("O seu nome é:" + nome + ".");
        System.out.println("O seu endereço é:" + endereco + ".");
        System.out.println("O seu cep é:" + cep + " e o seu telefone é:" + telefone + ".");
    }
}
