import java.util.Scanner;
public class Potencia {
     // metodo potencia(sem retorno);
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);

    }
    // metodo main (com retorno);
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("digite a base:");
                int base = sc.nextInt();
                System.out.print("digite o expoente:");
                int expoente = sc.nextInt();
                int resultado = potencia(base, expoente);
                System.out.println(" a potencia é igual a :" + resultado);
    }
        }





