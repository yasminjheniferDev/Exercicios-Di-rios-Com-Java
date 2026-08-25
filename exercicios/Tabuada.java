import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
           int N = sc.nextInt();
         tabuada(N);

           sc.close();

        }
    }
    public static void tabuada(int N){
        for( int i = 1 ; i <= 10 ;i++){
           int resultado = i * N;
            System.out.println(i + " x " + N + " = " + resultado);

           }
        }
    }

