import java.util.Scanner;

public class DiametroComprimentoArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite  o valor do raio:");
        double raio= sc.nextDouble();
        double d= raio * 2;
        double c= Math.PI * d;
        double a= Math.PI * Math.pow(raio,2);

        System.out.printf("Diâmetro: %.2f%n",d);
        System.out.printf("Comprimento: %.2f%n",c);
        System.out.printf("Àrea: %.2f%n",a);

    }
}
