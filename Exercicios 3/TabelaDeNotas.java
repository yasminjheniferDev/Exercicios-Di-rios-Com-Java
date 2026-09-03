import java.util.Scanner;

public class TabelaDeNotas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("aluno 1:");
        String aluno1= sc.nextLine();

        System.out.println("Qual a sua nota?");
        double nota1= sc.nextDouble();
        sc.nextLine();

        System.out.println("aluno 2:");
        String aluno2= sc.nextLine();


        System.out.println("Qual a sua nota?");
        double nota2=sc.nextDouble();
        sc.nextLine();


        System.out.println("aluno 3:");
        String aluno3= sc.nextLine();


        System.out.println("Qual a sua nota?");
        double nota3= sc.nextDouble();
        sc.nextLine();


        System.out.println("aluno 4:");
        String aluno4= sc.nextLine();


        System.out.println("Qual a sua nota? ");
        double nota4= sc.nextDouble();
        sc.nextLine();

        System.out.println("Aluno(A)   "+"Nota  ");
        System.out.println("========"+"   "+"=====");
        System.out.println(aluno1 + "      "+nota1);
        System.out.println(aluno2 + "      "+nota2);
        System.out.println(aluno3 + "      "+nota3);
        System.out.println(aluno4 + "     "+nota4);





    }
}
