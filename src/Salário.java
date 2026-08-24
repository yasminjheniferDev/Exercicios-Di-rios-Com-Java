import java.util.Scanner;

public class Salário {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int numf= teclado.nextInt();
       int numhoras= teclado.nextInt();
       double valhoras= teclado.nextDouble();
       double sal= numhoras * valhoras;
       System.out.println("NUMBER = " + numf);
       System.out.printf("SALARY = U$ %.2f%n", sal);


    }
}
