import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valorA= teclado.nextInt();
        int valorB= teclado.nextInt();
        int valorC= teclado.nextInt();
        int MaiorAB= (valorA + valorB + Math.abs(valorA-valorB))/2;
        int MaiorABC =(MaiorAB + valorC +Math.abs(MaiorAB - valorC))/2;
        System.out.printf(MaiorABC + " eh o maior\n");
    }
}
