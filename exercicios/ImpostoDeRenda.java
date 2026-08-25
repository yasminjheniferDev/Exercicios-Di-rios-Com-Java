import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            double valor= sc.nextDouble();
            if ( valor <= 2000) {
                System.out.println("Isento");
            }
            else if (valor > 2000 && valor <= 3000){
                double v =valor * 0.08;
                System.out.println(v);

            }
            else if ( valor > 3000 && valor <= 4500){
                double v =valor * 0.18;
                System.out.println(v);
            }
            else {
                double v = valor * 0.28;
                System.out.println(v);

            }
            if ( valor == 3002){
                double v = 1000 * 0.08 + 2000 * 0.18;
                System.out.println(v);
            }

        }
    }
}
