import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int valor = sc.nextInt();
        for (  int n = 1; n <=valor ; n++  ){
            if( n % 2 ==1){
                System.out.println(n);
            }
        }
    }
}
