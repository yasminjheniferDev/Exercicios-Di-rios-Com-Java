import java.util.Scanner;

public class SalárioComBônus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        Double sal= teclado.nextDouble();
        Double totv= teclado.nextDouble();
        Double totcom= totv *  0.15;
        Double totfimdomes = totcom + sal;
        System.out.printf("TOTAL = R$ %.2f\n",totfimdomes);


    }
}
